public class LoopInvSuite92 {

    public static void loop(int x, int y, int z1, int z2, int z3) {
      x = 0;
      y = 0;

      if (x == 0 && y == 0) {
        while (y >= 0) {
          y = y + x;
        }
      }
      
      assert y >= 0;
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
