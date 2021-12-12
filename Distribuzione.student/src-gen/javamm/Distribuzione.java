package javamm;

@SuppressWarnings("all")
public class Distribuzione {
  /**
   * Un array di numeri interi positivi si dice
   * d-uniforme, per qualche d>0, se e' ordinato
   * in modo non crescente e se ogni valore appare
   * esattamente d volte. Ad esempio, l'array
   * {13,13,13,8,8,8,6,6,6}
   * e' 3-uniforme.
   * La distribuzione di un array d-uniforme
   * contenente n elementi, e' l'array
   * ottenuto ponendo le d copie di
   * ciascun valore in n/d gruppi ordinati in
   * modo decrescente, uno di seguito all'altro.
   * Ad esempio la distribuzione dell'array
   * {13,13,13,8,8,8,6,6,6}
   * e' l'array
   * {13,8,6,13,8,6,13,8,6}.
   * Scrivere un metodo, detto distribuisci, che,
   * dato in input un array a di numeri interi
   * positivi ordinato in modo non crescente,
   * restituisca la distribuzione di a, se a e'
   * d-uniforme per qualche d>0, altrimenti
   * restituisca l'array a stesso. Ad esempio, con
   * input l'array
   * {13,13,13,8,8,8,6,6,6}
   * il metodo deve restituire l'array
   * {13,8,6,13,8,6,13,8,6},
   * mentre con input l'array
   * {13,13,13,8,8,8,6,6}
   * il metodo deve restituire l'array
   * {13,13,13,8,8,8,6,6}.
   * Infine, con input l'array
   * {13,13,13}
   * il metodo deve restituire l'array
   * {13,13,13}.
   */
  public static int[] distribuisci(int[] a) {
    int d = 1;
    int i = 1;
    int[] res = new int[a.length];
    while ((a[(i - 1)] == a[i])) {
      {
        d++;
        i++;
      }
    }
    int _length = a.length;
    boolean _tripleEquals = (d == _length);
    if (_tripleEquals) {
      return a;
    }
    int cont = 0;
    int tmp = a[d];
    for (int k = d; (k < a.length); k++) {
      boolean _tripleEquals_1 = (a[k] == tmp);
      if (_tripleEquals_1) {
        cont++;
      } else {
        if ((cont != d)) {
          return a;
        } else {
          tmp = a[k];
          cont = 1;
        }
      }
    }
    int _length_1 = a.length;
    int gruppi = (_length_1 / d);
    if (((cont != d) || (gruppi == 1))) {
      return a;
    }
    int c = 0;
    for (i = 0; (i < d); i++) {
      for (int j = 0; (j < gruppi); j++) {
        {
          res[c] = a[(i + (j * d))];
          c++;
        }
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
    Distribuzione.distribuisci(new int[] { 1, 1, 2, 2 });
  }
}
