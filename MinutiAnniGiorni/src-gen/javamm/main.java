package javamm;

@SuppressWarnings("all")
public class main {
  public static void main(String[] args) {
    int minuti = 230045;
    int giorni = 0;
    int anno = 0;
    giorni = (minuti / (60 * 24));
    minuti = (minuti % (60 * 24));
    anno = (giorni / 365);
    giorni = (giorni % 365);
    System.out.println(((((("Anni: " + Integer.valueOf(anno)) + " Giorni: ") + Integer.valueOf(giorni)) + " Minuti: ") + Integer.valueOf(minuti)));
  }
}
