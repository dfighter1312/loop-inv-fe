public class LoopInvSuite100 {

    public static void loop(int n, int x, int y) {
      y = 0;

      if (n >= 0 && x == n && y == 0) {
        while (x > 0) {
          {
            y = y + 1;
            x = x - 1;
          }
        }
      }

      assert y == n;
    }

    public static void main(String[] args) {
        if(args.length >= 3) {
          loop(
            args[0].length(),
            args[1].length(),
            args[2].length()
          );
        }
    }
}
