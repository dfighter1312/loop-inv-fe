public class LoopInvSuite107 {

    public static void loop(int a, int m, int j, int k) {
      j = 0;
      k = 0;

      if (j == 0 && k == 0) {
        while (k < 1) {
          if (m < a) {
            m = a;
          }
          k = k + 1;
        }
      }
      
      assert a <= m;
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
