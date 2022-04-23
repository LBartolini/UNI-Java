package esercitazione.interfaccia_auto;

public class Auto implements InterfacciaAuto {
	
	private double consumo; // litri per 100 km
	private double serbatoio;
	private final int MAX_VIAGGI = 100;
	private int[] viaggi;
	private int indiceViaggi, kmUltimoRifornimento;;
	
	public Auto(double consumo) throws Exception {
		if(consumo <= 0)
			throw new Exception("Il consumo medio deve essere un valore positivo!");
		this.consumo = consumo;
		viaggi = new int[MAX_VIAGGI];
		indiceViaggi = 0;
		serbatoio = 0;
		kmUltimoRifornimento = 0;
	}

	@Override
	public void viaggio(int k) throws Exception {
		if(k <= 0)
			throw new Exception("Il valore dei km deve essere positivo!");
		if(indiceViaggi == MAX_VIAGGI)
			throw new Exception("Limite massimo di viaggi raggiunto!");
		if((consumo/100)*k > serbatoio)
			throw new Exception("Benzina nel serbatoio non sufficiente!");
		
		kmUltimoRifornimento += k;
		viaggi[indiceViaggi++] = k;
		serbatoio -= (consumo/100)*k;
	}

	@Override
	public int rifornimento(double c) throws Exception {
		if(c <= 0)
			throw new Exception("Il valore del rifornimento deve essere positivo!");
		if(serbatoio+c > MAX_SERBATOIO)
			throw new Exception("Capienza massima del serbatoio raggiunta!");
		
		serbatoio += c;
		int temp = kmUltimoRifornimento;
		kmUltimoRifornimento = 0;
		
		return temp;
	}

	@Override
	public double media() {
		double somma = 0;
		
		for(int i = 0; i < indiceViaggi; i++) {
			somma += viaggi[i];
		}
		
		return somma/indiceViaggi;
	}

}
