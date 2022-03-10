package EsC;

import java.util.ArrayList;

/*
 * Definire la classe Autocarro caratterizzata
 * dalla targa, anno di immatricolazione, dal carico
 * massimo ammesso espresso in quintali con un valore
 * reale e dalla velocità massima espressa in Km/h
 * con un valore intero.
 *
 * Definire il costruttore della classe Autocarro.
 *
 * Definire il metodo della classe Autocarro per
 * inserire un trasporto di merce. Un trasporto
 * è definito dal peso del carico in quintali
 * (tenendo conto dei vincoli dell'autocarro
 * utilizzato) e dai chilometri percorsi. E'
 * necessario fare una verifica dei dati inseriti,
 * ma non e' richiesta la gestione degli errori di
 * inserimento.
 *
 * Definire un metodo della classe Autocarro per
 * il calcolo dell'indice di usura dell'autocarro,
 * definito come media pesata dei chilometri totali
 * percorsi rispetto al carico trasportato.
 * Ad esempio, se un autocarro ha fatto due
 * trasporti, 100km con 7.2q e 50km con 3.4q,
 * l'indice di usura sarà dato da
 * ((100*7.2)+(50*3.4))/(7.2+3.4).
 *
 * Definire un metodo stampa() per stampare
 * i dati dell'autocarro, cioè targa, anno di
 * immatricolazione, carico massimo, velocità massima,
 * indice di usura e lista dei trasporti effettuati.
 *
 */

public class Autocarro {
	private String targa;
	private int anno_imm;
	private double carico_massimo;
	private int vel_massima;
	private ArrayList<Trasporto> trasporti_effettuati;

	
	public Autocarro(String targa, int anno_imm, double carico_massimo, int vel_massima) {
		this.targa = targa;
		this.anno_imm = anno_imm;
		this.carico_massimo = carico_massimo;
		this.vel_massima = vel_massima;
		trasporti_effettuati = new ArrayList<Trasporto>();
	}
	
	public void inserisciTrasporto(double peso, int distanza) {
		if(this.carico_massimo >= peso) {
			// OK
			trasporti_effettuati.add(new Trasporto(peso, distanza));
		}
	}
	
	public double getUsura() {
		double carico_totale = 0;
		double somma = 0;
		
		for(Trasporto t: trasporti_effettuati) {
			carico_totale += t.getCarico();
			somma += t.getUsura();
		}
		
		return somma/carico_totale;
	}
	
	public void stampaAutocarro() {
		System.out.println("Autocarro {");
		System.out.println("Targa: "+targa);
		System.out.println("Anno Immatricolazione: "+anno_imm);
		System.out.println("Carico Massimo: "+carico_massimo);
		System.out.println("Velocità Massima: "+vel_massima);
		System.out.println("Usura: "+getUsura());
		System.out.println("Trasporti Effettuati {");
		for(Trasporto t: trasporti_effettuati) {
			t.stampaTrasporto();
		}
		System.out.println(" }\n}");
		
	}
	
}
