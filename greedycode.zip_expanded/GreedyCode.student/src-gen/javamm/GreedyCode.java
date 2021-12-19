package javamm;

@SuppressWarnings("all")
public class GreedyCode {
  public static int[] contaOccorrenze(long n) {
    int[] occorrenze = new int[10];
    while ((n > 0)) {
      {
        byte cifra = ((byte) (n % 10));
        occorrenze[cifra]++;
        n = (n / 10);
      }
    }
    return occorrenze;
  }
  
  public static char[] greedyCode(long n) {
    int[] occorrenze = GreedyCode.contaOccorrenze(n);
    char[] ret = new char[10];
    byte lettera = 97;
    for (int i = 0; (i < occorrenze.length); i++) {
      {
        int max = 0;
        for (int j = 1; (j < occorrenze.length); j++) {
          boolean _lessThan = (occorrenze[max] < occorrenze[j]);
          if (_lessThan) {
            max = j;
          }
        }
        occorrenze[max] = -1;
        ret[max] = ((char) lettera);
        lettera++;
      }
    }
    return ret;
  }
  
  public static void main(String[] args) {
  }
}
