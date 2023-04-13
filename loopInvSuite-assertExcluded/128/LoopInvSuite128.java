public class LoopInvSuite128 {

    public static void loop(int x, int y) {
      x = 1;

      if (x == 1) {
        while (x < y) {
          x = x + x;
        }
      }

      assert x >= 1;
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
