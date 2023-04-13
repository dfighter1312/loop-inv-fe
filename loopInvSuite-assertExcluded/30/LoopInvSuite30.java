public class LoopInvSuite30 {

    public static void loop(int x) {
      x = 100;
      
      if (x == 100) {
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
