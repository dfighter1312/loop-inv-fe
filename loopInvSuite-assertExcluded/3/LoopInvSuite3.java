public class LoopInvSuite3 {

    public static void loop(int y, int z) {
      int x = 0;
      
      if (x == 0) {
        while (x < 5) {
          x += 1;
          if (z <= y) {
            y = z;
          }
        }
      }

      assert z >= y;
    }

    public static void main(String[] args) {
        if(args.length >= 2) {
          loop(args[0].length(),args[1].length());
        }
    }
}
