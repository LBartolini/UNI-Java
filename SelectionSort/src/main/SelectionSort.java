package main;

public class SelectionSort {
	
	private static void scambia(int[] v, int i, int j) {
		if(i == j) return;
		
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
	
	private static int min(int[] v, int inizio, int fine) {
		int min = v[inizio];
		int min_idx = inizio;
		
		for(int i = inizio; i <= fine; i++) {
			if(v[i]<min) {
				min = v[i];
				min_idx = i;
			}
		}
		
		return min_idx;
	}
	
	public static void selectionSort(int[] v) {
		for(int i = 0; i < v.length; i++) {
			int min = min(v, i, v.length-1);
			scambia(v, i, min);
		}
	}
	
	public static void selectionSortRicorsivo(int[] v, int i) {
		if(i == v.length-1) return;
		
		int min = min(v, i, v.length-1);
		scambia(v, i, min);
		
		selectionSortRicorsivo(v, i+1);
		
	}
	
}
