public class LoopInvSuite69 {

    public static void loop(int n, int y, int v1, int v2, int v3) {
      int x = 1;

      while (x <= n) {
        y = n - x;
        x = x + 1;
      }
      
      if (n > 0) {
        assert y >= 0;
      };
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
