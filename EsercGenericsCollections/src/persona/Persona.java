package persona;

public abstract class Persona {
	private String cognome;
	private String nome;
	private int eta;
	
	public Persona(String c, String n, int e) throws Exception {
		if (c.length()>1 && n.length()>1 && e>=0) {
			cognome = c; 
			nome = n; 
			eta = e;
		} else {
			throw new Exception("Persona non creata");
		}		 
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}		
}

