package main;

public class main {

	public static void main(String[] args) {
		System.out.println("SelectionSort");
		
		int[] v = {1, 5, 2, 10, 9, 8, 11, 0, 20, 3, 4, 12, 7};
		
		SelectionSort.selectionSortRicorsivo(v, 0);
		
		stampaArray(v);
	}
	
	public static void stampaArray(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.printf("%2d ", v[i]);
		}
	}

}
