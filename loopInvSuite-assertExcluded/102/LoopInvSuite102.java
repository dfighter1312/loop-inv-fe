public class LoopInvSuite102 {

    public static void loop(int n, int x) {
      x = 0;
      
      if (x == 0) {
        while (x < n) {
          x = x + 1;
        }
      }

      if (n >= 0) {
        assert x == n;
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
