package main;

public class InsertionSort {
	
	private static void scambia(int[] v, int i, int j) {
		if(i == j) return;
		
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
	
	public static void insertionSort(int[] v) {
		insertionSort(v, v.length);
	}
	
	public static void insertionSort(int[] v, int end) {
		int t, t_idx;
		for(int i = 1; i < end; i++) {
			t = v[i];
			t_idx = i;
			
			while(t_idx >= 1 && v[t_idx-1] > t) {
				v[t_idx] = v[t_idx-1];
				t_idx = t_idx-1;
			}
			
			v[t_idx] = t;
		}
	}

	public static void shellSort(int[] v) {
		// guardati su internet come funziona
		
		int colonne = (int)(v.length/2);
		
		while(colonne > 1) {
			
			for(int i = 0; i < colonne; i++) {
				int len = (int) Math.ceil(v.length/(float)colonne);
				int[] arr = new int[len];
				int k = 0;
				
				for(int j = i; j < v.length; j=j+colonne) {
					arr[k] = v[j];
					k++;
				}
				
				insertionSort(arr, k);
				
				for(int j = 0; j < k; j++) {
					v[i+j*colonne] = arr[j];
				}
			}
			
			colonne = (int)(colonne/2);
		}
		
		insertionSort(v);
	}
	
}
