
public class NodoBinPF<T> {
	
	private T info;
	private NodoBinPF<T> sx, dx, padre;
	
	public NodoBinPF(T x) {
		info = x;
	}
	
	public int getLivello() {
		int livello = 0;
		NodoBinPF<T> app = this;
		while(app.getPadre() != null) {
			app = app.getPadre();
			livello++;
		}
		
		return livello;
	}
	

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public NodoBinPF<T> getSx() {
		return sx;
	}

	public void setSx(NodoBinPF<T> sx) {
		this.sx = sx;
	}

	public NodoBinPF<T> getDx() {
		return dx;
	}

	public void setDx(NodoBinPF<T> dx) {
		this.dx = dx;
	}

	public NodoBinPF<T> getPadre() {
		return padre;
	}

	public void setPadre(NodoBinPF<T> padre) {
		this.padre = padre;
	}
	
	
	
}
