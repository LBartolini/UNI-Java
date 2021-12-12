package javamm;

@SuppressWarnings("all")
public class ContaSottomatrici {
  public static int contaSottomatrici(int[][] T, int[][] S) {
    int count = 0;
    for (int i = 0; (i <= (T.length - S.length)); i++) {
      for (int j = 0; (j <= (T[0].length - S[0].length)); j++) {
        {
          boolean ok = true;
          for (int r = 0; ((r < S.length) && ok); r++) {
            for (int c = 0; ((c < S[0].length) && ok); c++) {
              boolean _tripleNotEquals = (T[(i + r)][(j + c)] != S[r][c]);
              if (_tripleNotEquals) {
                ok = false;
              }
            }
          }
          if (ok) {
            count++;
          }
        }
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
  }
}
