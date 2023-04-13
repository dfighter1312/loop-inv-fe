public class LoopInvSuite95 {

    public static void loop(int i, int j, int x, int y) {
      i = 0;
      j = 0;
      y = 1;

      if (i == 0 && j == 0 && y == 1) {
        while (i <= x) {
          i = i + 1;
          j = j + y;
        }
      }
      
      if (y == 1) {
        assert i == j;
      }
    }

    public static void main(String[] args) {
        if(args.length >= 4) {
          loop(
            args[0].length(),
            args[1].length(),
            args[2].length(),
            args[3].length()
          );
        }
    }
}
