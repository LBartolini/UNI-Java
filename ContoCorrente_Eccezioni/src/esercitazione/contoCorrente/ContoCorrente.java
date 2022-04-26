package esercitazione.contoCorrente;


public class ContoCorrente {
	
	private final int MAX_OP = 100, MALUS_TROPPE_OP = 50;
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
		numeroOperazioni++;
		if (importo < 0) {
			throw new ImportoNegativoException(importo);
		}
		if(numeroOperazioni>=MAX_OP) {
			this.saldo -= MALUS_TROPPE_OP;
			throw new TroppeOperazioniException(importo);
		}
		saldo += importo;
	}
	
	public void prelievo(double importo) throws SaldoInsufficienteException, TroppeOperazioniException, ImportoNegativoException{
		numeroOperazioni++;
		if(importo < 0)
			throw new ImportoNegativoException(importo);
		if (importo > saldo)
			throw new SaldoInsufficienteException(saldo, importo);
		if(numeroOperazioni>=MAX_OP) {
			this.saldo -= MALUS_TROPPE_OP;
			throw new TroppeOperazioniException(-importo);
		}
		saldo -= importo;
	}
} 