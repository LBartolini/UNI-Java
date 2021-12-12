package javamm;

@SuppressWarnings("all")
public class EsplosioneMatrice {
  public static int[] findNext(int[][] T, int r, int c) {
    int[] ret = new int[] { Math.max((r - 1), 0), Math.max((c - 1), 0) };
    for (int i = Math.max((r - 1), 0); (i <= Math.min((r + 1), (T.length - 1))); i++) {
      for (int j = Math.max((c - 1), 0); (j <= Math.min((c + 1), (T[0].length - 1))); j++) {
        boolean _tripleEquals = (T[i][j] == 1);
        if (_tripleEquals) {
          boolean _greaterThan = (i > ret[0]);
          if (_greaterThan) {
            ret[0] = i;
            ret[1] = j;
          } else {
            if (((i == ret[0]) && (j > ret[1]))) {
              ret[1] = j;
            }
          }
        }
      }
    }
    return ret;
  }
  
  public static int[][] esplodiMatrice(int[][] T, int r, int c) {
    boolean _tripleEquals = (T[r][c] == 0);
    if (_tripleEquals) {
      return T;
    }
    T[r][c] = 0;
    int[] next = EsplosioneMatrice.findNext(T, r, c);
    return EsplosioneMatrice.esplodiMatrice(T, next[0], next[1]);
  }
  
  public static void main(String[] args) {
  }
}
