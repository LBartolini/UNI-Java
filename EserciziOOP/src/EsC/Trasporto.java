package EsC;

public class Trasporto {
	private static int progr = 0;
	private int distanza;
	private int id;
	private double carico;
	
	public Trasporto(double carico, int distanza) {
		this.carico = carico;
		this.distanza = distanza;
		id = progr++;
	}
	
	public double getUsura() {
		return carico*distanza;
	}
	
	public double getCarico() {
		return carico;
	}
	
	public void stampaTrasporto() {
		System.out.println(id+" "+distanza+" km, "+carico+" kg");
	}
	
}
