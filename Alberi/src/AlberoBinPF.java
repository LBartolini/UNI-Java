
public class AlberoBinPF<T> {
	
	private NodoBinPF<T> radice;
	private int numNodi, altezza;
	public NodoBinPF<T> getRadice() {
		return radice;
	}
	public void setRadice(NodoBinPF<T> radice) {
		this.radice = radice;
	}
	public int getNumNodi() {
		return numNodi;
	}
	public void setNumNodi(int numNodi) {
		this.numNodi = numNodi;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public int grado(NodoBinPF<T> v) {
		if((v.getSx()!=null) && (v.getDx()!= null)) {
			return 2;
		}else {
			if((v.getSx() != null) || (v.getDx() != null)) {
				return 1;
			}
		}
		
		return 0;
	}

	
}
