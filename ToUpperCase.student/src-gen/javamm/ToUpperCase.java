package javamm;

@SuppressWarnings("all")
public class ToUpperCase {
  public static char[] upperCase(char[] a) {
    char[] tmp = new char[a.length];
    for (int i = 0; (i < a.length); i++) {
      {
        int x = ((int) a[i]);
        if (((x <= 122) && (x >= 97))) {
          int _x = x;
          x = (_x - 32);
        }
        tmp[i] = ((char) x);
      }
    }
    return tmp;
  }
  
  public static void main(String[] args) {
  }
}
