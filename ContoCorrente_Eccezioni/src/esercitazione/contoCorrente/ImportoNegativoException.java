package esercitazione.contoCorrente;

public class ImportoNegativoException extends ContoCorrenteException{
	public ImportoNegativoException(double importo) {
		super("Importo negativo: " + importo);
	}
}
