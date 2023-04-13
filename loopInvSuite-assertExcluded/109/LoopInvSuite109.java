public class LoopInvSuite109 {

    public static void loop(int a, int c, int m, int j, int k) {
      j = 0;
      k = 0;

      if (a <= m && j == 0 && k == 0) {
        while (k < c) {
          if (m < a) {
            m = a;
          }
          k = k + 1;
        }
      }
      
      if (c > 0) {
        assert a <= m;
      }
    }

    public static void main(String[] args) {
        if(args.length >= 5) {
          loop(
            args[0].length(),
            args[1].length(),
            args[2].length(),
            args[3].length(),
            args[4].length()
          );
        }
    }
}
