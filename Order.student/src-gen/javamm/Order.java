package javamm;

@SuppressWarnings("all")
public class Order {
  public static boolean order(int a, int b, int c, boolean noA) {
    if (noA) {
      if ((b < c)) {
        return true;
      }
      return false;
    } else {
      if (((a < b) && (b < c))) {
        return true;
      }
      return false;
    }
  }
  
  public static void main(String[] args) {
  }
}
