package esercitazione.contoCorrente;

public class Main {

	public static void main(String[] args) {
		ContoCorrente cc = new ContoCorrente("abc", 1000);
		for(int i=0; i < 60; i++) {
			try {
				cc.deposito(100);
				cc.prelievo(80);	
			}catch(TroppeOperazioniException TOE) {
				System.out.println("L'operazione è stata annullata!");
				cc.setNumeroOperazioni(0);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
