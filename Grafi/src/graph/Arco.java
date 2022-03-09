package graph;

public class Arco {
	private Nodo n1, n2;
	private boolean visitato = false;
	
	public Arco(Nodo n1, Nodo n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	public Nodo getDest(Nodo n) {
		if(n1 == n) return n2;
		if(n2 == n) return n1;
		
		return null;
	}
	
	public Nodo[] getNodi() {
		Nodo[] out = {n1, n2};
		
		return out;
	}
	
	public boolean getVisitato() {
		return visitato;
	}
	
	public void setVisitato(boolean v) {
		visitato = v;
	}

}
