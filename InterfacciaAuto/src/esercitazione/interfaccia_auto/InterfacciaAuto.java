package esercitazione.interfaccia_auto;

public interface InterfacciaAuto {
	public static final double MAX_SERBATOIO = 120.0;

	public void viaggio(int k) throws Exception;
	public int rifornimento(double c) throws Exception;
	public double media();
}
