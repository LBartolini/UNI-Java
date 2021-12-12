package javamm;

@SuppressWarnings("all")
public class main {
  public static void main(String[] args) {
    int x = 345;
    int unita = 0;
    int decine = 0;
    int centinaia = 0;
    int somma = 0;
    unita = (x % 10);
    int _x = x;
    x = (_x / 10);
    decine = (x % 10);
    int _x_1 = x;
    x = (_x_1 / 10);
    centinaia = (x % 10);
    int _x_2 = x;
    x = (_x_2 / 10);
    somma = ((unita + decine) + centinaia);
    System.out.println(somma);
  }
}
