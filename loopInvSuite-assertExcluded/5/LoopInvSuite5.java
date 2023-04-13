public class LoopInvSuite5 {

    public static void loop(int size, int y, int z) {
      int x = 0;
      
      if (x == 0) {
        while (x < size) {
          x += 1;
          if (z <= y) {
            y = z;
          }
        }
      }

      if (size > 0) {
        assert z >= y;
      }
    }

    public static void main(String[] args) {
        if(args.length >= 3) {
          loop(args[0].length(),args[1].length(),args[2].length());
        }
    }
}
