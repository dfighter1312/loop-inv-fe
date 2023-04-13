public class LoopInvSuite94 {

    public static void loop(int i, int j, int k, int n) {
      i = 0;
      j = 0;

      if (i == 0 && j == 0) {
        while (i <= n) {
          i = i + 1;
          j = j + i;
        }
      }
      
      assert ((i + (j + k)) > (2 * n));
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
