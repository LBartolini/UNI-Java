package javamm;

@SuppressWarnings("all")
public class Occorrenze {
  public static int massimo(int[] a) {
    int max = a[0];
    for (int i = 1; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > max);
      if (_greaterThan) {
        max = a[i];
      }
    }
    return max;
  }
  
  public static int contaOccorrenze(int[] a, int num) {
    int conta = 0;
    for (int i = 0; (i < a.length); i++) {
      boolean _tripleEquals = (a[i] == num);
      if (_tripleEquals) {
        conta++;
      }
    }
    return conta;
  }
  
  public static int[] costruisciO(int[] a) {
    int[] o = new int[(Occorrenze.massimo(a) + 1)];
    for (int i = 0; (i < o.length); i++) {
      o[i] = Occorrenze.contaOccorrenze(a, i);
    }
    return o;
  }
  
  public static int contaNonNegativi(int[] o) {
    int conta = 0;
    for (int i = 0; (i < o.length); i++) {
      boolean _greaterThan = (o[i] > 0);
      if (_greaterThan) {
        conta++;
      }
    }
    return conta;
  }
  
  public static int[] costruisciOC(int[] o) {
    int[] oc = new int[Occorrenze.contaNonNegativi(o)];
    for (int i = 0, j = 0; (i < o.length); i++) {
      boolean _greaterThan = (o[i] > 0);
      if (_greaterThan) {
        oc[j++] = o[i];
      }
    }
    return oc;
  }
  
  public static int[] occorrenzeCompresso(int[] a) {
    int[] o = Occorrenze.costruisciO(a);
    return Occorrenze.costruisciOC(o);
  }
  
  public static void main(String[] args) {
  }
}
