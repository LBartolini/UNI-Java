package esercitazione.veicolo;

import java.util.ArrayList;

public class Concessionaria {
	
	private ArrayList<Veicolo> garage;
	
	public Concessionaria() {
		this.garage = new ArrayList<>();
	}
	
	public void aggiungiVeicolo(Veicolo v) {
		this.garage.add(v);
	}
	
	public int calcolaValoreTotale() {
		int somma = 0;
		
		for(Veicolo v: garage) {
			somma += v.calcolaValoreAttuale();
		}
		
		return somma;
	}
	
	@Override
	public String toString() {
		String out = "";
		
		for(Veicolo v: garage) {
			out += v.toString() + "\n";
		}
		
		out += "\nValore totale: "+calcolaValoreTotale();
		
		return out;
	}

}
