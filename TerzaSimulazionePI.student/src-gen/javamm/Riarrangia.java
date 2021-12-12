package javamm;

@SuppressWarnings("all")
public class Riarrangia {
  public static int[] contaPositiviNegativi(int[] a) {
    int[] ret = { 0, 0 };
    for (int i = 0; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > 0);
      if (_greaterThan) {
        ret[0]++;
      } else {
        ret[1]++;
      }
    }
    return ret;
  }
  
  public static int[] riarrangia(int[] a) {
    int[] ret = new int[a.length];
    int[] numPosNeg = Riarrangia.contaPositiviNegativi(a);
    boolean flagNeg = (numPosNeg[1] > 0);
    boolean flagPos = (numPosNeg[0] > 0);
    int current = 0;
    int last_pos = -1;
    int last_neg = -1;
    int contPos = 0;
    int contNeg = 0;
    while ((flagNeg || flagPos)) {
      {
        while (((last_neg < a.length) && flagNeg)) {
          {
            last_neg++;
            boolean _lessThan = (a[last_neg] < 0);
            if (_lessThan) {
              ret[current] = a[last_neg];
              contNeg++;
              current++;
              break;
            }
          }
        }
        while (((last_pos < a.length) && flagPos)) {
          {
            last_pos++;
            boolean _greaterThan = (a[last_pos] > 0);
            if (_greaterThan) {
              ret[current] = a[last_pos];
              contPos++;
              current++;
              break;
            }
          }
        }
        boolean _greaterEqualsThan = (contNeg >= numPosNeg[1]);
        if (_greaterEqualsThan) {
          flagNeg = false;
        }
        boolean _greaterEqualsThan_1 = (contPos >= numPosNeg[0]);
        if (_greaterEqualsThan_1) {
          flagPos = false;
        }
      }
    }
    return ret;
  }
  
  public static void main(String[] args) {
  }
}
