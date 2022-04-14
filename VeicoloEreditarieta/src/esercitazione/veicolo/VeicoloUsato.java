package esercitazione.veicolo;

import java.util.Calendar;

public class VeicoloUsato extends Veicolo implements Usato {
	
	private final int annoImmatricolazione;
	
	public VeicoloUsato(String targa, int prezzo, int annoImmatricolazione) {
		super(targa, prezzo);
		
		this.annoImmatricolazione = annoImmatricolazione;
	}
	
	@Override
	public int calcolaValoreAttuale() {
		return prezzo - prezzo*calcolaSvalutazione()/100;
	}
	
	@Override
	public int calcolaSvalutazione() {
		int year = Calendar.getInstance().get(Calendar. YEAR);
		int svalutazione = (year - annoImmatricolazione + 1)*5;
		
		return 100 - (int)(((prezzo-svalutazione)/(float)prezzo)*100);
	}
	
	@Override
	public String toString() {
		return "Targa: "+targa+" Prezzo: "+calcolaValoreAttuale()+" Svalutazione: "+calcolaSvalutazione()+"%";
	}
}
