package javamm;

@SuppressWarnings("all")
public class euclid {
  public static void main(String[] args) {
    int a = 6;
    int b = 4;
    while ((b > 0)) {
      {
        int x = (a % b);
        a = b;
        b = x;
      }
    }
    System.out.println(a);
  }
}
