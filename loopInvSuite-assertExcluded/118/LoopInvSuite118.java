public class LoopInvSuite118 {

    public static void loop(int i, int size, int sn) {
      sn = 0;
      i = 1;

      if (sn == 0 && i == 1) {
        while (i <= size) {
          i = i + 1;
          sn = sn + 1;
        }
      }

      if (sn != size) {
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
