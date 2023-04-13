public class LoopInvSuite83 {

    public static void loop(int x, int y) {
      x = -5000;

      while (x < 0) {
        x = x + y;
        y = y + 1;
      }
      
      assert y > 0;
    }

    public static void main(String[] args) {
        if(args.length >= 2) {
          loop(
            args[0].length(),
            args[1].length()
          );
        }
    }
}
