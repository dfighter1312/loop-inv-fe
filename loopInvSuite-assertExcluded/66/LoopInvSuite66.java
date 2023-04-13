public class LoopInvSuite66 {

    public static void loop(int y) {
      int x = 1;

      while (x <= 100) {
        y = 100 - x;
        x = x + 1;
      }
      
      assert y < 100;
    }

    public static void main(String[] args) {
        if(args.length >= 1) {
          loop(
            args[0].length()
          );
        }
    }
}
