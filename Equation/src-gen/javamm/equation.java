package javamm;

@SuppressWarnings("all")
public class equation {
  public static void main(String[] args) {
    float a = 1;
    float b = 6;
    if ((a == 0)) {
      if ((b == 0)) {
        System.out.println("Indeterminata");
      } else {
        System.out.println("Impossibile");
      }
    } else {
      float _minus = (-b);
      float _divide = (_minus / a);
      System.out.println(_divide);
    }
  }
}
