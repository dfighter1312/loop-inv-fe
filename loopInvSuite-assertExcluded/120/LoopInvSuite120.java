public class LoopInvSuite120 {

    public static void loop(int i, int sn) {
      sn = 0;
      i = 1;

      if (sn == 0 && i == 1) {
        while (i <= 8) {
          i = i + 1;
          sn = sn + 1;
        }
      }

      if (sn != 8) {
        assert sn == 0;
      }
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
