public class LoopInvSuite103 {

    public static void loop(int x) {
      x = 0;

      if (x == 0) {
        while (x < 100) {
          x = x + 1;
        }
      }

      assert x == 100;
    }

    public static void main(String[] args) {
        if(args.length >= 1) {
          loop(
            args[0].length()
          );
        }
    }
}
