public class Radix {

  public static int nth(int n, int col) {
    int var = n / ((int)Math.pow(10, col) % 10);
    return var;
  }


}
