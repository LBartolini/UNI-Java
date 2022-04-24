package esercitazione.televisore_v2;

public class Radiomarelli extends Televisore {
	
	private final int MIN_FREQ = 600, MAX_FREQ = 800;
	private int nCanali;
	private int[] canali;
	
	public Radiomarelli(int p, String nomeModello, int nCanali) throws Exception {
		super(p);
	
		if(nomeModello == null || nomeModello.length() == 0)
			throw new Exception("Parametro nomeModello invalido!");
		if(nCanali <= 1)
			throw new Exception("Parametro nCanali invalido!");
		
		this.nomeModello = nomeModello;
		this.nCanali = nCanali;
		canali = new int[nCanali];
	}
	
	private int cercaCanale(int freq) {

		for(int i = 0; i < nCanali; i++) {
			if(canali[i] == freq) 
				return i;
		}
		
		return -1;
	}
	
	public void setCanale(int canale, int freq) throws Exception {
		if(cercaCanale(freq) != -1) return;
		if(freq < MIN_FREQ || freq > MAX_FREQ)
			throw new Exception("Parametro frequenza non valido!");
		
		canali[canale] = freq;
	}

	public String toString() {
		String ret = nomeModello+":\n\tPollici: "+getPollici()+"\n";
		
		for(int i = 0; i < nCanali; i++) {
			if(canali[i] != 0) {
				ret += "\tCanale "+i+":"+canali[i]+"\n";
			}
		}
		
		return ret;
	}
	
}
