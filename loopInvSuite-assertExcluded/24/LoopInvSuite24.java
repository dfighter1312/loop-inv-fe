public class LoopInvSuite24 {

    public static void loop(int i, int j) {
      i = 1;
      j = 10;

      if (i == 1 && j == 10) {
        while (j >= i) {
          i = i + 2;
          j = j - 1;
        }
      }

      assert j == 6;
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
