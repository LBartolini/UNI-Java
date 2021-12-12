package javamm;

@SuppressWarnings("all")
public class lunghezzaMaxSeq {
  /**
   * Definire un metodo ricorsivo Java--, chiamato lunghezzaMaxSeq che,
   * dati in input un array a di caratteri (con almeno un elemento) ed
   * un carattere c, restituisca la lunghezza della pi� lunga sequenza
   * di caratteri c consecutivi in a.
   * Nota bene: una soluzione non ricorsiva � considerata errata, anche
   * se supera i JUnit test.
   */
  public static int findMax(char[] a, char c, int i, int j, int seqLen) {
    int _length = a.length;
    boolean _greaterEqualsThan = (j >= _length);
    if (_greaterEqualsThan) {
      return seqLen;
    }
    if (((a[i] != c) && (a[j] == c))) {
      return Math.max(seqLen, lunghezzaMaxSeq.findMax(a, c, (i + 1), (j + 1), (seqLen + 1)));
    } else {
      if (((a[i] == c) && (a[j] == c))) {
        return Math.max(seqLen, lunghezzaMaxSeq.findMax(a, c, (i + 1), (j + 1), (seqLen + 1)));
      } else {
        return Math.max(seqLen, lunghezzaMaxSeq.findMax(a, c, (i + 1), (j + 1), 0));
      }
    }
  }
  
  public static int lunghezzaMaxSeq(char[] a, char c) {
    int _xjconditionalexpression = (int) 0;
    boolean _tripleEquals = (a[0] == c);
    if (_tripleEquals) {
      _xjconditionalexpression = 1;
    } else {
      _xjconditionalexpression = 0;
    }
    return lunghezzaMaxSeq.findMax(a, c, 0, 1, _xjconditionalexpression);
  }
  
  public static void main(String[] args) {
  }
}
