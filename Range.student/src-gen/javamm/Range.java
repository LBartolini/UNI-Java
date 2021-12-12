package javamm;

@SuppressWarnings("all")
public class Range {
  public static boolean range(int n, int l, int r, boolean o) {
    if (((n >= l) && (n <= r))) {
      boolean _not = (!o);
      return _not;
    }
    return o;
  }
  
  public static void main(String[] args) {
  }
}
