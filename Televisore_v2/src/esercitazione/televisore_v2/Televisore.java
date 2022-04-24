package esercitazione.televisore_v2;


public abstract class Televisore {
	private int pollici;
	protected String nomeModello;

	public Televisore(int p) throws Exception {		
		if (p > 10)
			pollici = p;
		else
			throw new Exception("Dimensione tv errata");		
	}
	

	public int getPollici() {
		return pollici;
	}
}