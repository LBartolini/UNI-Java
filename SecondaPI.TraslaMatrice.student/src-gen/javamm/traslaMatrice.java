package javamm;

@SuppressWarnings("all")
public class traslaMatrice {
  /**
   * Scrivere un metodo Java--, chiamato traslaMatrice, che
   * dato in input una matrice T di numeri interi, di dimensione m x n
   * (con m>0 e n>0), e un numero intero y, restituisca una nuova matrice
   * ottenuta applicando alla matrice T una traslazione verticale di y
   * posizioni.
   */
  public static int[][] traslaMatrice(int[][] T, int y) {
    int r = T.length;
    int c = T[0].length;
    int[][] ret = new int[r][c];
    for (int i = 0; (i < r); i++) {
      for (int j = 0; (j < c); j++) {
        ret[((((i + y) % r) + (r * Math.abs(y))) % r)][j] = T[i][j];
      }
    }
    return ret;
  }
  
  public static void main(String[] args) {
  }
}
