package main;
import esercitazione.veicolo.*;

public class Main {

	public static void main(String[] args) {
		Concessionaria c = new Concessionaria();
		c.aggiungiVeicolo(new Veicolo("ABC123", 1000));
		c.aggiungiVeicolo(new VeicoloUsato("ABC124", 1000, 2010));
		c.aggiungiVeicolo(new VeicoloUsato("ABC125", 1000, 2006));
		c.aggiungiVeicolo(new VeicoloUsato("ABC126", 1000, 2018));
		c.aggiungiVeicolo(new VeicoloUsato("ABC127", 1000, 2014));
		
		System.out.println(c);
	}

}
