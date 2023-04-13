public class LoopInvSuite68 {

    public static void loop(int n, int y) {
      int x = 1;

      while (x <= n) {
        y = n - x;
        x = x + 1;
      }
      
      if (n > 0) {
        assert y <= n;
      };
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
