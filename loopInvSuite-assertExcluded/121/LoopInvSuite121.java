public class LoopInvSuite121 {

    public static void loop(int i, int sn) {
      sn = 0;
      i = 1;

      if (sn == 0 && i == 1) {
        while (i <= 8) {
          i = i + 1;
          sn = sn + 1;
        }
      }

      if (sn != 0) {
        assert sn == 8;
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
