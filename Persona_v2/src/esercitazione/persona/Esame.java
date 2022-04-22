package esercitazione.persona;

public class Esame {
	
	private String nomeCorso;
	private int voto, crediti;
	
	public Esame(String nomeCorso, int voto, int crediti) throws Exception{
		if(voto > 30 || voto < 0)
			throw new Exception("Voto non valido, deve essere compreso tra 0 e 30");
		if(crediti < 0)
			throw new Exception("Crediti non valido, deve essere un valore positivo");
		
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.crediti = crediti;
	}
	
	public int getVoto() {
		return voto;
	}
	
	public int getCrediti() {
		return crediti;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public String toString() {
		return nomeCorso + " ("+ crediti +"CFU): " + voto + "/30";
	}
}
