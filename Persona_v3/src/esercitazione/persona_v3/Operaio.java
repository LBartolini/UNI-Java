package esercitazione.persona_v3;

public class Operaio extends Persona {
	
	private int retrOrdinaria, retrStraordinaria, indiceGiornateLavorative;
	private GiornataLavorativa[] giornateLavorative;
	private final int MAX_GIORNATE_LAVORATIVE = 20, MAX_ORE_ORDINARIE = 8, MAX_ORE_GIORNATA = 12;
	
	public Operaio(String c, String n, int e, int ro, int rs) throws Exception {
		super(c, n, e);
		
		if(rs <= ro)
			throw new Exception("Parametri retribuzione errati!");
		
		indiceGiornateLavorative = 0;
		retrOrdinaria = ro;
		retrStraordinaria = rs;
		giornateLavorative = new GiornataLavorativa[MAX_GIORNATE_LAVORATIVE];
	}
	
	public void inserisciGiornataLavorativa(int ore) throws Exception {
		if(ore > MAX_ORE_GIORNATA || ore <= 0)
			throw new Exception("Parametro ore invalido");
		
		if(ore > MAX_ORE_ORDINARIE) {
			giornateLavorative[indiceGiornateLavorative++] = new GiornataLavorativa(MAX_ORE_ORDINARIE, ore-MAX_ORE_ORDINARIE);
		}else {
			giornateLavorative[indiceGiornateLavorative++] = new GiornataLavorativa(ore, 0);
		}
	}
	
	public int calcolaStipendio() {
		int somma = 0;
		
		for(int i = 0 ; i < indiceGiornateLavorative; i++) {
			somma += giornateLavorative[i].calcolaCosto(retrOrdinaria, retrStraordinaria);
		}
		
		indiceGiornateLavorative = 0;
		return somma;
	}
	
}
