package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    int u = (n % 10);
    while ((n > 9)) {
      int _n = n;
      n = (_n / 10);
    }
    return (u + n);
  }
  
  public static void main(String[] args) {
  }
}
