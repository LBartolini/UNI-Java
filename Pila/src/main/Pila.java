package main;

public class Pila<T> {
	
	private T[] pila;
	private int top;
	private int initDim;
	
	public Pila(int n) {
		initDim = n;
		pila = (T[]) new Object[n];
		top = 0;
	}
	
	public int length() {
		return top;
	}
	
	private void checkDoubling() {
		if(top >= pila.length) {
			
			T[] temp = (T[]) new Object[pila.length*2];
			
			for(int i = 0; i < top; i++) {
				temp[i] = pila[i];
			}
			
			pila = temp;
		}
	}
	
	private void checkHalving() {
		if(top <= (pila.length/4)) {
			T[] temp = (T[]) new Object[pila.length/2];
			
			for(int i = 0; i < top; i++) {
				temp[i] = pila[i];
			}
			
			pila = temp;
		}
	}
	
	public void push(T x) {
		checkDoubling();
		pila[top++] = x;
	}
	
	public T pop() {
		if(top == 0) return null;
		checkHalving();
		return pila[top--];
	}
	
	public void svuotaPila() {
		top = 0;
		pila = (T[]) new Object[initDim];
	}
	
	public T top() {
		if(top==0) return null;
		
		return pila[top-1];
	}
	
}
