public class LoopInvSuite98 {

    public static void loop(int i, int j, int x, int y) {
      i = 0;
      j = 0;
      y = 2;

      if (i == 0 && j == 0 && y == 2) {
        while (i <= x) {
          i = i + 1;
          j = j + y;
        }
      }
      
      if (i != j) {
        assert y != 1;
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
