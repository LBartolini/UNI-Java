package javamm;

@SuppressWarnings("all")
public class TestBilanciamento {
  public static int checkSum(int[] array, int i) {
    int sum = (array[i] + array[((array.length - i) - 1)]);
    int _length = array.length;
    int _divide = (_length / 2);
    int _minus = (_divide - 1);
    boolean _tripleEquals = (i == _minus);
    if (_tripleEquals) {
      return sum;
    }
    int nextSum = TestBilanciamento.checkSum(array, (i + 1));
    if ((nextSum == sum)) {
      return nextSum;
    }
    return -1;
  }
  
  public static boolean testBilanciamento(int[] mioArray) {
    if ((((mioArray.length % 2) != 0) || (mioArray.length == 0))) {
      return false;
    }
    int _length = mioArray.length;
    boolean _tripleEquals = (_length == 2);
    if (_tripleEquals) {
      boolean _tripleEquals_1 = (mioArray[0] == mioArray[1]);
      if (_tripleEquals_1) {
        return true;
      }
      return false;
    }
    int somma = (mioArray[0] + mioArray[(mioArray.length - 1)]);
    int _checkSum = TestBilanciamento.checkSum(mioArray, 1);
    return (somma == _checkSum);
  }
  
  public static void main(String[] args) {
  }
}
