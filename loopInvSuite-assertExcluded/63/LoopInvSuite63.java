public class LoopInvSuite63 {

    public static void loop(int y) {
      int x = 1;

      while (x <= 10) {
        y = 10 - x;
        x = x + 1;
      }
      
      assert y >= 0;
    }

    public static void main(String[] args) {
        if(args.length >= 1) {
          loop(
            args[0].length()
          );
        }
    }
}
