package esercitazione.veicolo_v2;

public abstract class Veicolo {
	private double consumo; // litri per 100 Km

	public Veicolo(double c) throws Exception {
		if (c > 0.0 && c < 20.0)
			consumo = c;
		else
			throw new Exception("Parametro consumo errato");
	}

	public double getConsumo() {
		return consumo;
	}
}