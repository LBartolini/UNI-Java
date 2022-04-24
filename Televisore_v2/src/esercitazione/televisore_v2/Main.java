package esercitazione.televisore_v2;

public class Main {

	public static void main(String[] args) {
		try {
			Radiomarelli tv = new Radiomarelli(40, "TV", 100);
			tv.setCanale(0, 650);
			tv.setCanale(1, 600);
			tv.setCanale(2, 652);
			
			System.out.println(tv);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
