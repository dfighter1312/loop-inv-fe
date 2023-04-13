public class LoopInvSuite27 {

    public static void loop(int n, int x) {
      x = n;

      if (x == n) {
        while (x > 1) {
          x = x - 1;
        }
      }

      if (n >= 0) {
        assert x == 1;
      }
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
