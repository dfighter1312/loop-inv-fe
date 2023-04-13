public class LoopInvSuite106 {

    public static void loop(int a, int m, int j, int k) {
      k = 0;

      if (a <= m && j < 1 && k == 0) {
        while (k < 1) {
          if (m < a) {
            m = a;
          }
          k = k + 1;
        }
      }
      
      assert a >= m;
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
