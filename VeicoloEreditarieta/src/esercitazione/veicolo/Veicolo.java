package esercitazione.veicolo;

public class Veicolo {
	
	protected final String targa;
	protected final int prezzo;
	
	public Veicolo(String targa, int prezzo) {
		this.targa = targa;
		this.prezzo = prezzo;
	}
	
	public int calcolaValoreAttuale() {
		return prezzo;
	}

	@Override
	public String toString() {
		return "Targa: "+targa+" Prezzo: "+prezzo;
	}

}
