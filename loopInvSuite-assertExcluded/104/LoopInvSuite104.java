public class LoopInvSuite104 {

    public static void loop(int n, int v1, int v2, int v3, int x) {
      x = 0;

      if (x == 0) {
        while (x < n) {
          x = x + 1;
        }
      }

      if (x != n) {
        assert n < 0;
      }
    }

    public static void main(String[] args) {
        if(args.length >= 5) {
          loop(
            args[0].length(),
            args[1].length(),
            args[2].length(),
            args[3].length(),
            args[4].length()
          );
        }
    }
}
