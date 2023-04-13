public class LoopInvSuite110 {

    public static void loop(int i, int n, int sn) {
      sn = 0;
      i = 1;

      if (sn == 0 && i == 1) {
        while (i <= n) {
          i = i + 1;
          sn = sn + 1;
        }
      }

      if (sn != n) {
        assert sn == 0;
      }
    }

    public static void main(String[] args) {
        if(args.length >= 3) {
          loop(
            args[0].length(),
            args[1].length(),
            args[2].length()
          );
        }
    }
}
