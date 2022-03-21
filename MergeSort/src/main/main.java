package main;

public class main {

	public static void main(String[] args) {
		System.out.println("MergeSort");
		
		int[] v = {1, 5, 2, 10, 9, 8, 11, 0, 20, 3, 4, 12, 7};
		
		MergeSort.mergeSortRec(v, 0, v.length-1);
		
		stampaArray(v);
	}
	
	public static void stampaArray(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.printf("%2d ", v[i]);
		}
	}

}
