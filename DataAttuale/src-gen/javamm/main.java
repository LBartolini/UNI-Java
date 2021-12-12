package javamm;

@SuppressWarnings("all")
public class main {
  public static void main(String[] args) {
    int ms = 1203183068;
    int sec = ((ms / 1000) % ((60 * 60) * 24));
    int h = (sec / (60 * 60));
    int _sec = sec;
    sec = (_sec % (60 * 60));
    int m = (sec / 60);
    int _sec_1 = sec;
    sec = (_sec_1 % 60);
    String _plus = (Integer.valueOf(h) + ":");
    String _plus_1 = (_plus + Integer.valueOf(m));
    String _plus_2 = (_plus_1 + ":");
    String _plus_3 = (_plus_2 + Integer.valueOf(sec));
    System.out.println(_plus_3);
  }
}
