package esercitazione.interfaccia_auto;

public class Main {

	public static void main(String[] args) {
		Auto a = new Auto(10); // 10 litri ogni 100 km ovvero 0.1 l/km
		
		try{
			a.rifornimento(10);
			a.viaggio(90);
			a.viaggio(15);
			a.viaggio(10);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(a.media());
		
	}

}
