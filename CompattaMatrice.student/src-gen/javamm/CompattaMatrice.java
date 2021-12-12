package javamm;

@SuppressWarnings("all")
public class CompattaMatrice {
  public static int contaElementi(int[][] A) {
    int conta = 0;
    for (int i = 0; (i < A.length); i++) {
      for (int j = 0; (j < A[0].length); j++) {
        boolean _tripleNotEquals = (A[i][j] != 0);
        if (_tripleNotEquals) {
          conta++;
        }
      }
    }
    return conta;
  }
  
  public static int[][] inserisciElementi(int[][] A, int numElementi) {
    int[][] compatta = new int[numElementi][3];
    int p = 0;
    for (int i = 0; (i < A.length); i++) {
      for (int j = 0; (j < A[0].length); j++) {
        boolean _tripleNotEquals = (A[i][j] != 0);
        if (_tripleNotEquals) {
          compatta[p][0] = A[i][j];
          compatta[p][1] = i;
          compatta[p][2] = j;
          p++;
        }
      }
    }
    return compatta;
  }
  
  public static int minimo(int[][] A, int inizio) {
    int m = inizio;
    for (int i = inizio; (i < A.length); i++) {
      boolean _lessThan = (A[i][0] < A[m][0]);
      if (_lessThan) {
        m = i;
      }
    }
    return m;
  }
  
  public static void selectionSort(int[][] A) {
    int[] tmpSwap = new int[3];
    int min = 0;
    for (int i = 0; (i < A.length); i++) {
      {
        min = CompattaMatrice.minimo(A, i);
        tmpSwap[0] = A[i][0];
        tmpSwap[1] = A[i][1];
        tmpSwap[2] = A[i][2];
        A[i][0] = A[min][0];
        A[i][1] = A[min][1];
        A[i][2] = A[min][2];
        A[min][0] = tmpSwap[0];
        A[min][1] = tmpSwap[1];
        A[min][2] = tmpSwap[2];
      }
    }
  }
  
  public static int[][] compattaMatrice(int[][] A) {
    int elementi = CompattaMatrice.contaElementi(A);
    if ((elementi == 0)) {
      return null;
    }
    int[][] compatta = CompattaMatrice.inserisciElementi(A, elementi);
    CompattaMatrice.selectionSort(compatta);
    return compatta;
  }
  
  public static void main(String[] args) {
  }
}
