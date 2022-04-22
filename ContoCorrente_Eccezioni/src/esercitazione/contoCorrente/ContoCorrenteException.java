package esercitazione.contoCorrente;

public class ContoCorrenteException extends Exception {
	
	public ContoCorrenteException(String message) {
		super(message);
	}
	
	public ContoCorrenteException() {
		super("ContoCorrenteException");
	}
	
}
