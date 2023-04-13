from datetime import datetime
import json
import streamlit as st
import pandas as pd

# Streamlit app config
st. set_page_config(layout="wide")

# Load the program details from the .csv file
program_df = pd.read_csv('program_details_updated.csv')

# Get mapping index
with open('map_index.json', 'r') as f:
    map_index = json.load(f)

def app():
    st.title("Examining the Loop Invariant Benchmark")
    st.write("The benchmark is taken from https://github.com/PL-ML/code2inv")
    
    # Dropdown for program index selection
    descr_index = st.selectbox(
        label="Select a program index",
        options=[" | ".join([i[0], str(i[1])]) for i in sorted(map_index.items(), key=lambda x: (x[0], x[1]))]
    )
    program_index = int(descr_index.split(" | ")[1])
    
    # Display the program details
    col1, col2 = st.columns(2)
    with col1:
        st.write("### Code Snippet")
        
        # C snippet
        st.write("**C**")
        with open(f"C_instances/c/{program_index}.c", 'r') as f:
            c_code_snippet = f.read()
        st.code(c_code_snippet, language='c')
        
        st.write("**Java**")
        try:
            with open(f"loopInvSuite-assertExcluded/{program_index}/LoopInvSuite{program_index}.java", 'r') as f:
                java_code_snippet = f.read()
        except:
            java_code_snippet = "# Unavailable"
        st.code(java_code_snippet)
        
    with col2:
        st.write("### Details")
        
        program_description = program_df[program_df["Index"] == program_index]
        st.write(f"**Loop Invariant:** $${program_description['Loop Invariant'].values[0]}$$".replace("&&", "\land").replace("||", "\lor"))
        st.write(f"**Ranking function:** $${program_description['Ranking Function'].values[0]}$$")
    
        # Add a comment section for the program
        st.write("### Comments")
        
        # Read comment file
        with open(f"comments.json", 'r') as f:
            comments = json.load(f)
        last_comments = comments.get(str(program_index), "*No comment*")
        st.write(last_comments)
        comment = st.text_input("Add a comment")
        if st.button("Submit"):
            if str(program_index) in comments:
                comments[str(program_index)] += f"[{datetime.now().isoformat(sep=' ', timespec='minutes')}] - {comment}\n\n"
            else:
                comments[str(program_index)] = f"[{datetime.now().isoformat(sep=' ', timespec='minutes')}] - {comment}\n\n"
            last_comments += f"[{datetime.now().isoformat(sep=' ', timespec='minutes')}] - {comment}\n\n"
            with open(f"comments.json", "w") as f:
                json.dump(comments, f)
            with open(f"comments.json", 'r') as f:
                comments = json.load(f)
            st.success("Comment sent! Click `Show all comments` or reload the page to see your updated comments")
        if st.button("Show all comments"):
            pass

    st.write("## Export File")
    export_format = st.selectbox(
        label="Select an export format",
        options=["CSV", "JSON"]
    )
    if st.button("Export"):
        df = pd.DataFrame(columns=['Index', 'Code Snippet', 'Loop Invariant', 'Ranking Function', 'Comment'])
        df['Index'] = range(1, 134)
        df['Loop Invariant'] = program_df['Loop Invariant']
        df['Ranking Function'] = program_df['Ranking Function']
        for idx in range(1, 134):
            with open(f"C_instances/c/{idx}.c", 'r') as f:
                code_snippet = f.read()
            df.loc[idx-1, 'Code Snippet'] = code_snippet
            df.loc[idx-1, 'Comment'] = comments.get(str(idx), "")
        
        if export_format == "CSV":
            st.download_button(
                label="Download CSV",
                data=df.to_csv(index=False).encode('utf-8'),
                file_name="loop_inv_benchmark.csv",
                mime="text/csv"
            )
        elif export_format == "JSON":
            st.download_button(
                label="Download JSON",
                data=df.to_json(index=False).encode('utf-8'),
                file_name="loop_inv_benchmark.json",
                mime="application/json"
            )
    pass

if __name__ == "__main__":
    app()