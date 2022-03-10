package EsC;

public class Main {

	public static void main(String[] args) {
		Autocarro a = new Autocarro("AB123AB", 2012, 15, 90);
		a.inserisciTrasporto(10, 100);
		a.inserisciTrasporto(5, 20);
		a.inserisciTrasporto(2, 10);
		a.inserisciTrasporto(14, 80);
		a.inserisciTrasporto(4, 110);
		
		a.stampaAutocarro();
	}

}
