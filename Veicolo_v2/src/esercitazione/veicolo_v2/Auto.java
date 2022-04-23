package esercitazione.veicolo_v2;

public class Auto extends Veicolo {
	
	private final double MAX_SERBATOIO = 120.0;
	private final int MAX_VIAGGI = 100;
	private double serbatoio;
	private int[] viaggi;
	private int indiceViaggi, kmUltimoRifornimento;;
	
	public Auto(double consumo) throws Exception{
		super(consumo);
		viaggi = new int[MAX_VIAGGI];
		indiceViaggi = 0;
		serbatoio = 0;
		kmUltimoRifornimento = 0;
	}

	public void viaggio(int k) throws Exception {
		if(k <= 0)
			throw new Exception("Il valore dei km deve essere positivo!");
		if(indiceViaggi == MAX_VIAGGI)
			throw new Exception("Limite massimo di viaggi raggiunto!");
		if((getConsumo()/100)*k > serbatoio)
			throw new Exception("Benzina nel serbatoio non sufficiente!");
		
		kmUltimoRifornimento += k;
		viaggi[indiceViaggi++] = k;
		serbatoio -= (getConsumo()/100)*k;
	}

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

	public double media() {
		double somma = 0;
		
		for(int i = 0; i < indiceViaggi; i++) {
			somma += viaggi[i];
		}
		
		return somma/indiceViaggi;
	}
	
}
