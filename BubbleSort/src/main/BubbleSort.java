package main;

public class BubbleSort {
	
	private static void scambia(int[] v, int i, int j) {
		if(i == j) return;
		
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
	
	public static void bubblesort(int[] v) {
		// fallo prima o poi
		return;
	}
	
	public static void shakersort(int[] v) {
		int inizio = 0;
		int fine = v.length-1;
		
		for(int j = 0; j <= v.length-1; j++) {
			
			//scansione da sx a dx
			boolean scambiAvvenuti = false;
			for(int i = inizio+1; i <= fine; i++) {
				if(v[i-1] > v[i]) {
					scambia(v, i-1, i);
					scambiAvvenuti = true;
				}
			}
			
			if(!scambiAvvenuti) {
				break;
			}
			
			//scansione da dx a sx
			scambiAvvenuti = false;
			fine--;
			for(int i = fine; i >= inizio+1; i--) {
				if(v[i-1] > v[i]) {
					scambia(v, i-1, i);
					
					scambiAvvenuti = true;
				}
			}
			
			if(!scambiAvvenuti) {
				break;
			}
			
			inizio++;
			
		}
	}
	
	public static void shakersort_2(int[] v) {
		int inizio = 0;
		int fine = v.length-1;
		boolean scambiAvvenuti = true;
		
		while(scambiAvvenuti) {
			//scansione da sx a dx
			scambiAvvenuti = false;
			for(int i = inizio+1; i <= fine; i++) {
				if(v[i-1] > v[i]) {
					scambia(v, i-1, i);
					
					scambiAvvenuti = true;
				}
			}
			
			if(!scambiAvvenuti) {
				break;
			}
			
			//scansione da dx a sx
			scambiAvvenuti = false;
			fine--;
			for(int i = fine; i >= inizio+1; i--) {
				if(v[i-1] > v[i]) {
					scambia(v, i-1, i);
					
					scambiAvvenuti = true;
				}
			}
			
			inizio++;
		}
	}
	
	public static void combsort(int[] v) {
		int passo = v.length;
		boolean scambiAvvenuti = false;
		
		while(passo>1 || scambiAvvenuti) {
			if(passo > 1) {
				passo = (int)(passo / 1.25);
			}
			
			scambiAvvenuti = false;
			
			for(int i=0; i+passo < v.length; i++) {
				if(v[i]>v[i+passo]) {
					scambia(v, i, i+passo);
					
					scambiAvvenuti = true;
				}
			}
		}
	}

}
