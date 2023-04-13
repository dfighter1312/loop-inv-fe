public class LoopInvSuite85 {

    public static void loop(int x, int y, int z1, int z2, int z3) {
      x = -15000;

      while (x < 0) {
        x = x + y;
        y = y + 1;
      }
      
      assert y > 0;
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
