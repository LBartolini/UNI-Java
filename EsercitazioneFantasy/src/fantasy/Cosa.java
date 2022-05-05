package fantasy;

public class Cosa {
	
	private String tipologia;
	private int valore;
	
	public Cosa(String tipo, int valore) {
		if(tipo == null || tipo.length() == 0)
			throw new IllegalArgumentException("Tipo can't be null or empty");
		
		tipologia = tipo;
		this.valore = (valore >= 0) ? valore : 0;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	
	public int getValore() {
		return valore;
	}
	
}
