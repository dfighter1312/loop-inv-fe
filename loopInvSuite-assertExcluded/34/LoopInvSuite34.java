public class LoopInvSuite34 {

    public static void loop(int n, int v1, int v2, int v3, int x) {
      
      if (x == n) {
        while (x > 0) {
          x = x - 1;
        }
      }
      if (n >= 0) {
        assert x == 0;
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
