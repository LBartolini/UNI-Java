
public class Coda {
	
	int dimensione, front=0, rear=0;
	int[] v;
	
	
	public Coda(int dim) {
		this.dimensione = dim;
		
		this.v = new int[dim];
	}
	
	private boolean comparaModuli() {
		return this.front%this.dimensione == this.rear%this.dimensione;
	}
	
	private int comparaIndici() {
		return this.rear-this.front;
	}
	
	public boolean isFull() {
		if(this.comparaModuli() && this.comparaIndici()>0) return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(this.comparaModuli() && this.comparaIndici()==0) return true;
		return false;
	}
	
	public int put(int elem) {
		// ritorna -1 se la coda è piena e quindi è 
		// impossibile aggiungere un ulteriore elemento
		// altrimenti aggiunge l'elemento in coda e ritorna 1
		if(this.isFull()) return -1;
		
		this.v[this.rear++] = elem;
		
		return 1;
	}
	
	public int get() {
		// ritorna -1 se la coda è vuota e quindi è 
		// impossibile prendere l'elemento
		// altrimenti ritorna l'elemento in testa alla coda
		if(this.isEmpty()) return -1;
		
		int tmp = this.v[this.front++];
		
		if(this.front == this.dimensione) {
			this.front %= this.dimensione;
			this.rear %= this.dimensione;
		}
		
		return tmp;
	}

}
