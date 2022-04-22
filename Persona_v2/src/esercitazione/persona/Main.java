package esercitazione.persona;

public class Main {

	public static void main(String[] args) throws Exception {
		Studente s = new Studente("lorenzo", "bartolini", 20, "ABC123");
		s.aggiungiEsame(new Esame("Programmazione", 30, 12));
		s.aggiungiEsame(new Esame("Programmazione", 29, 6));
		System.out.println(s);
	}

}
