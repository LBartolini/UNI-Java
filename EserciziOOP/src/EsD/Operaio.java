package EsD;

import java.util.ArrayList;

/* Definire la classe Operaio definita
 * nel modo seguente.
 * Un operaio e' caratterizzato dalle seguenti
 * informazioni: nome, cognome, età, retribuzione oraria
 * standard in euro, retribuzione oraria degli
 * straordinari in euro, e lista delle ore standard
 * e straordinarie svolte giornalmente (si assume
 * un numero massimo di 20 giornate di lavoro al mese).
 * La retribuzione degli straordinari deve essere
 * strettamente maggiore di quella standard.
 *
 * Definire il metodo della classe Operaio per
 * inserire le ore di una singola giornata di
 * lavoro. Il metodo prende le ore totali della
 * giornata come unico parametro; fino ad un
 * massimo di 8 vengono considerate come ore
 * standard, eventuali ore aggiuntive sono
 * considerate come straordinari, comunque nel
 * totale le ore giornaliere non possono superare
 * le 12 ore.
 *
 * Definire il metodo della classe Operaio per
 * il calcolo dello stipendio mensile, basato sul
 * numero di ore standard/straordinarie e le
 * rispettive retribuzioni. Il metodo svuotera'
 * le liste delle ore in vista del mese successivo.
 *
 * Definire il metodo stampa() per stampare
 * tutti i dati dell'operaio, cioe' nome, cognome,
 * eta', lista delle ore attualmente svolte nel
 * mese in corso.
 *
 */

public class Operaio {
	
	private String nome, cognome;
	private int eta, retr_ord, retr_str;
	private int[] ore_ord, ore_str;
	private int giorno=0;
	
	public Operaio(String nome, String cognome, int eta, int retr_ord, int retr_str) {
		if(retr_str <= retr_ord) return;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.retr_ord = retr_ord;
		this.retr_str = retr_str;
		resetOre();
	}
	
	private void resetOre() {
		ore_ord = new int[20];
		ore_str = new int[20];
	}
	
	public void inserisciOre(int ore) {
		if(ore > 12) return;
		
		ore_ord[giorno] = Math.min(ore, 8);
		ore_str[giorno] = Math.max(ore-8, 0);
		giorno++;
	}
	
	public int calcolaStipendio() {
		int stipendio = 0;
		
		for(int i = 0; i < giorno; i++) {
			stipendio += ore_ord[i]*retr_ord + ore_str[i]*retr_str;
		}
		
		resetOre();
		giorno = 0;
		
		return stipendio;
	}

}
