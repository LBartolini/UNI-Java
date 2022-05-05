package persona;

public class GiornataLavorativa {
	private int oreOrdinarie, oreStraordinarie;
	
	public GiornataLavorativa(int oo, int os) throws Exception {
		if(oo < 0 || os < 0)
			throw new Exception("Parametri errati per la GiornataLavorativa!");
		
		oreOrdinarie = oo;
		oreStraordinarie = os;
	}

	public int calcolaCosto(int retrOrdinaria, int retrStraordinaria) {
		return oreOrdinarie*retrOrdinaria + oreStraordinarie*retrStraordinaria;
	}
	
}
