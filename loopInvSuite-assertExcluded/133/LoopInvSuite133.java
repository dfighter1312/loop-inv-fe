public class LoopInvSuite133 {

    public static void loop(int n, int x) {

      if (x == 0 && n >= 0) {
        while (x < n) {
          x = x + 1;
        }
      }

      assert x == n;
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
