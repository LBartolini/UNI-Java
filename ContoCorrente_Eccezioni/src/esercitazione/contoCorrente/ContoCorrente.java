package esercitazione.contoCorrente;


public class ContoCorrente {
	private final String nome;
	private int numeroOperazioni;
	private double saldo;

	public ContoCorrente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.numeroOperazioni = 0;
	}

	public String getName() {
		return nome;
	}

	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumeroOperazioni(int nuovoNumeroOp) {
		this.numeroOperazioni = nuovoNumeroOp;
	}

	public void deposito(double importo) throws ImportoNegativoException, TroppeOperazioniException {
		if (importo < 0) {
			throw new ImportoNegativoException(importo);
		}
		if(numeroOperazioni==100) {
			this.saldo -= 50;
			throw new TroppeOperazioniException(importo);
		}
		saldo += importo;
		numeroOperazioni++;
	}
	
	public void prelievo(double importo) throws SaldoInsufficienteException, TroppeOperazioniException{
		if ((importo < 0) || (importo > saldo))
			throw new SaldoInsufficienteException(saldo, importo);
		if(numeroOperazioni==100) {
			this.saldo -= 50;
			throw new TroppeOperazioniException(-importo);
		}
		saldo -= importo;
		numeroOperazioni++;
	}
} 