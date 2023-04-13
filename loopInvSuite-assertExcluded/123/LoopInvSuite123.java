public class LoopInvSuite123 {

    public static void loop(int i, int size, int sn, int v1, int v2, int v3) {
      sn = 0;
      i = 1;

      if (sn == 0 && i == 1) {
        while (i <= size) {
          i = i + 1;
          sn = sn + 1;
        }
      }

      if (sn != 0) {
        assert sn == size;
      }
    }

    public static void main(String[] args) {
        if(args.length >= 6) {
          loop(
            args[0].length(),
            args[1].length(),
            args[2].length(),
            args[3].length(),
            args[4].length(),
            args[5].length()
          );
        }
    }
}
