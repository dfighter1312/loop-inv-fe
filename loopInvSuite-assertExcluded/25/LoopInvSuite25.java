public class LoopInvSuite25 {

    public static void loop(int x) {
      x = 10000;

      if (x == 10000) {
        while (x > 0) {
          x = x - 1;
        }
      }

      assert x == 0;
    }

    public static void main(String[] args) {
        if(args.length >= 1) {
          loop(
            args[0].length()
          );
        }
    }
}
