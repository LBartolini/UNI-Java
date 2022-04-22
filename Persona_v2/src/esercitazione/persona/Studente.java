package esercitazione.persona;

public class Studente extends Persona {
	
	private final String matricola;
	private Esame[] esamiSostenuti;
	private int indiceEsamiSost;
	
	public Studente(String c, String n, int e, String matricola) throws Exception {
		super(c, n, e);
		
		this.matricola = matricola;
		esamiSostenuti = new Esame[30];
		indiceEsamiSost = 0;
	}
	
	public void aggiungiEsame(Esame e) throws Exception {
		if(e == null)
			throw new NullPointerException("Esame non può essere nullo");
		if(indiceEsamiSost == 30)
			throw new Exception("Limite di esami raggiunto (max 30)");
		esamiSostenuti[indiceEsamiSost++] = e;
	}
	
	public double calcolaMedia() {
		if(indiceEsamiSost == 0)
			return 0;
		
		double somma = 0;
		int creditiTotale = 0;
		
		for (int i = 0; i < indiceEsamiSost; i++) {
			Esame e = esamiSostenuti[i];
			somma += e.getVoto()*e.getCrediti();
			creditiTotale += e.getCrediti();
		}
		
		return somma/creditiTotale;
	}
	
	public String toString() {
		String ret = getNome() + " " + getCognome() + " " + getEta() + " " + matricola + "\nMedia: " + calcolaMedia()+"\n\n";
		
		for (int i = 0; i < indiceEsamiSost; i++) {
			ret += esamiSostenuti[i].toString() + "\n";
		}
		
		return ret;
	}
	
}
