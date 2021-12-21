package main;

public class Cerca {
	/*
	 * Definire un metodo RICORSIVO che restituisce true
	 * se il numero x è presente nell'array a; altrimenti 
	 * restituisce false. 
	 */


	static boolean cerca(int x, int[] a, int i) {
		if(i >= a.length) return false;
		if (a[i]==x) return true;
		
		return cerca(x, a, i+1);
	}
	
	static boolean cercaRic(int x, int[] a){
		return cerca(x, a, 0); 
	}
 
	
	
}
