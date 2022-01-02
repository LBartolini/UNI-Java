package javamm;

@SuppressWarnings("all")
public class Downhill {
  public static int max(int[] risultati) {
    int max = risultati[0];
    for (int r : risultati) {
      if ((r > max)) {
        max = r;
      }
    }
    return max;
  }
  
  public static int trovaDDL(int[][] m, int[] x, int[] prev, int lungh) {
    if (((x[0] == prev[0]) && (x[1] == prev[1]))) {
      return lungh;
    }
    int[][] offsets = { new int[] { -1, 0 }, new int[] { 0, -1 }, new int[] { 1, 0 }, new int[] { 0, 1 } };
    int[] nextPos = new int[] { x[0], x[1] };
    int nextVal = m[x[0]][x[1]];
    for (int[] off : offsets) {
      boolean _not = (!(((((off[0] + x[0]) < 0) || ((off[0] + x[0]) >= m.length)) || ((off[1] + x[1]) < 0)) || ((off[1] + x[1]) >= m[0].length)));
      if (_not) {
        boolean _greaterThan = (nextVal > m[(off[0] + x[0])][(off[1] + x[1])]);
        if (_greaterThan) {
          nextVal = m[(off[0] + x[0])][(off[1] + x[1])];
          int _plus = (off[0] + x[0]);
          int _plus_1 = (off[1] + x[1]);
          nextPos = new int[] { _plus, _plus_1 };
        }
      }
    }
    return Downhill.trovaDDL(m, nextPos, x, (lungh + 1));
  }
  
  public static void popolaRisultati(int[] risultati, int[][] m) {
    int cont = 0;
    for (int i = 0; (i < m.length); i++) {
      for (int j = 0; (j < m[0].length); j++) {
        {
          risultati[cont] = Downhill.trovaDDL(m, new int[] { i, j }, new int[] { -1, -1 }, 0);
          cont++;
        }
      }
    }
  }
  
  public static int ddl(int[][] m) {
    int[] risultati = new int[(m.length * m[0].length)];
    Downhill.popolaRisultati(risultati, m);
    return Downhill.max(risultati);
  }
  
  public static void main(String[] args) {
  }
}
