package javamm;

@SuppressWarnings("all")
public class ScalarProduct {
  public static int scalarProduct(int[] a, int[] b) {
    int scProd = 0;
    for (int i = 0; (i < a.length); i++) {
      int _scProd = scProd;
      int _multiply = (a[i] * b[i]);
      scProd = (_scProd + _multiply);
    }
    return scProd;
  }
  
  public static void main(String[] args) {
  }
}
