public class LoopInvSuite130 {

    public static void loop(int x2, int x3) {
      int d1 = 1;
      int d2 = 1;
      int d3 = 1;
      int x1 = 1;

      while (x1 > 0) {
        if (x2 > 0) {
          if (x3 > 0) {
            x1 = x1 - d1;
            x2 = x2 - d2;
            x3 = x3 - d3;
          }
        }
      }

      assert x2 >= 0;
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
