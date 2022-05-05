package fantasy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class Personaggio {

	private String nome;
	private List<Cosa> borsa;
	private int forza, energia;
	public final static int MIN_FORZA=1, MAX_FORZA=10, MIN_ENERGIA=0, MAX_ENERGIA=100, MAX_BORSA=20;
	
	public Personaggio(String nome, int forza) throws IllegalArgumentException {
		if(nome == null || forza < MIN_FORZA || forza > MAX_FORZA)
			throw new IllegalArgumentException();
		
		this.nome = nome;
		energia = MAX_ENERGIA;
		this.forza = forza;
		borsa = new LinkedList<>();
	}
	
	public void inserisciCosaNellaBorsa(Cosa cosa) {
		if(borsa.size()>=MAX_BORSA)
			return;
		
		borsa.add(cosa);
	}
	
	public Cosa consumaCosa(String tipologia) throws CosaNonPresenteException {
		Cosa cosa = cercaCosa(tipologia);
		
		if(cosa == null)
			throw new CosaNonPresenteException();
		
		borsa.remove(cosa);
		return cosa;
	}
	
	private Cosa cercaCosa(String tipologia) {
		Iterator<Cosa> i = borsa.iterator();
		
		while(i.hasNext()) {
			Cosa temp = i.next();
			
			if(temp.getTipologia().equals(tipologia)) {
				return temp;
			}
		}
		
		return null;
	}
	
	public int calcolaValoreTotaleBorsa() {
		int somma = 0;
		
		for(Cosa c : borsa) {
			somma += c.getValore();
		}
		
		return somma;
	}
	
	public void scambia(String tipologia, Personaggio altro) throws CosaNonPresenteException {
		Cosa cosa_this = cercaCosa(tipologia);
		Cosa cosa_altro = altro.cercaCosa(tipologia);
		
		if(cosa_this == null || cosa_altro == null)
			throw new CosaNonPresenteException();
		
		altro.borsa.remove(cosa_altro);
		this.borsa.remove(cosa_this);
		
		this.borsa.add(cosa_altro);
		altro.borsa.add(cosa_this);
	}

	public void applicaDanno(int danno) {
		energia -= danno;
		energia = (energia<MIN_ENERGIA) ? MIN_ENERGIA : energia;
	}
	
	public String getNome() {
		return nome;
	}

	public int getForza() {
		return forza;
	}

	public int getEnergia() {
		return energia;
	}
	
	public String toString() {
		String temp = this.getClass().getName()+" "+nome+", Forza "+forza+", Energia "+energia+"\n";
		
		temp += "Borsa: [";
		for(Cosa c: borsa) {
			temp += c.toString();
		}
		temp+="]\n";
		
		return temp;
	}

}
