package esercitazione.interfaccia_auto;

public class Auto implements InterfacciaAuto {
	
	private double consumo; // litri per 100 km
	private double serbatoio;
	private int[] viaggi;
	private int indiceViaggi, kmUltimoRifornimento;;
	
	public Auto(double consumo) {
		this.consumo = consumo;
		viaggi = new int[100];
		indiceViaggi = 0;
		serbatoio = 0;
		kmUltimoRifornimento = 0;
	}

	@Override
	public void viaggio(int k) throws Exception {
		if(indiceViaggi == 100)
			throw new Exception("Limite massimo di viaggi raggiunto!");
		if((consumo/100)*k > serbatoio)
			throw new Exception("Benzina nel serbatoio non sufficiente!");
		
		kmUltimoRifornimento += k;
		viaggi[indiceViaggi++] = k;
		serbatoio -= (consumo/100)*k;
	}

	@Override
	public int rifornimento(double c) throws Exception {
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
