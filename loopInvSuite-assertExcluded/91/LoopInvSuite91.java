public class LoopInvSuite91 {

    public static void loop(int x, int y) {
      x = 0;
      y = 0;

      if (x == 0 && y == 0) {
        while (y >= 0) {
          y = y + x;
        }
      }
      
      assert y >= 0;
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
