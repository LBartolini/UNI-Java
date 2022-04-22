package esercitazione.contoCorrente;

public class TroppeOperazioniException extends ContoCorrenteException {
	private final double importo;
	
	public TroppeOperazioniException(double importo) {
		super();
		this.importo = importo;
	}
	
	public double getImporto() {
		return importo;
	}
	
}
