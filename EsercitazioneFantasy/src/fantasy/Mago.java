package fantasy;

import java.util.Random;

public class Mago extends Personaggio implements Combattente, Magico{
	
	private static Random r = new Random();
	private int potereMagico;
	public final static int MAX_FORZA=6, MIN_POTERE_MAGICO=5, MAX_POTERE_MAGICO=10;
	
	public Mago(String nome, int forza, int potereMagico) {
		super(nome, forza);
		
		if(potereMagico < MIN_POTERE_MAGICO || potereMagico > MAX_POTERE_MAGICO || forza > MAX_FORZA)
			throw new IllegalArgumentException();
		
		this.potereMagico = potereMagico;
	}
	
	public Mago(String nome) {
		this(nome, r.nextInt(MAX_FORZA-MIN_FORZA+1)+MIN_FORZA, r.nextInt(MAX_POTERE_MAGICO-MIN_POTERE_MAGICO+1)+MIN_POTERE_MAGICO);
	}	
	
	public int attacca(Personaggio altro) {
		int danno = getForza()*2;
		altro.applicaDanno(danno);
		
		return danno;
	}
	
	public int eseguiIncantesimo(Personaggio altro) {
		int danno = getPotereMagico() + getEnergia()/10;
		altro.applicaDanno(danno);
		
		return danno;
	}

	public int getPotereMagico() {
		return potereMagico;
	}
	
	public String toString() {
		String temp = super.toString();
		temp += "Potere Magico "+potereMagico;
		
		return temp;
	}
	
}
