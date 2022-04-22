package esercitazione.contoCorrente;

public class SaldoInsufficienteException extends ContoCorrenteException{
	
	public SaldoInsufficienteException(double saldo, double importo) {
		super("Saldo= " + saldo + ", impossibile prelevare " + importo);
	}
	
}
