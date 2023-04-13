public class LoopInvSuite129 {

    public static void loop(int x, int y, int z1, int z2, int z3) {
      x = 1;

      if (x == 1) {
        while (x < y) {
          x = x + x;
        }
      }

      assert x >= 1;
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
