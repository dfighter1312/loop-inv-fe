public class LoopInvSuite125 {

    public static void loop(int i, int j, int x, int y) {
      x = i;
      y = j;

      if (i == x && j == y) {
        while (x != 0) {
          {
            x = x - 1;
            y = y - 1;
          }
        }
      }

      if (y != 0) {
        assert i != j;
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
