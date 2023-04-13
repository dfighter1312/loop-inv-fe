public class LoopInvSuite28 {

    public static void loop(int n, int x) {
      x = n;

      if (x == n) {
        while (x > 0) {
          x = x - 1;
        }
      }

      if (x != 0) {
        assert n < 0;
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
