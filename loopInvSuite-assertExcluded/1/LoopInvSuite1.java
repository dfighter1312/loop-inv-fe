public class LoopInvSuite1 {

    public static void loop(int x, int y) {
      x = 1;
      y = 0;

      if (x == 1 && y == 0) {
        while (y < 10) {
          {
            x = x + y;
            y = y + 1;
          }
        }
      }
    }

    public static void main(String[] args) {
        if(args.length >= 2) {
          loop(args[0].length(),args[1].length());
        }
    }
}
