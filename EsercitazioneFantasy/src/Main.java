import fantasy.*;

public class Main {

	public static void main(String[] args) {
		avviaGioco();
	}
	
	public static void avviaGioco() {
		Mago m;
		
		try {
			m = new Mago("Lorenzo", 3, 8);
		} catch (IllegalArgumentException e) {
			m = new Mago("Lorenzo");
		}
		
		System.out.println(m);
	}

}
