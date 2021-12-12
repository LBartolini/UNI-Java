package javamm;

@SuppressWarnings("all")
public class IsSum {
  public static boolean isSum(int a, int b, int c) {
    if ((((a == (b + c)) || (b == (a + c))) || (c == (a + b)))) {
      return true;
    }
    return false;
  }
  
  public static void main(String[] args) {
  }
}
