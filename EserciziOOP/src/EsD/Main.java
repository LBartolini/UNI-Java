package EsD;

public class Main {

	public static void main(String[] args) {
		Operaio o = new Operaio("Lorenzo", "Bartolini", 19, 10, 20);
		
		o.inserisciOre(8);
		o.inserisciOre(8);
		o.inserisciOre(8);
		o.inserisciOre(8);
		o.inserisciOre(8);
		o.inserisciOre(10);
		o.inserisciOre(10);
		o.inserisciOre(10);
		o.inserisciOre(10);
		o.inserisciOre(10);
		
		System.out.println(o.calcolaStipendio());

	}

}
