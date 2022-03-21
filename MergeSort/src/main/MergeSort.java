package main;

public class MergeSort {
	
	public static void mergeSortRec(int[] A, int left, int right) {
		if(left >= right) return;
		
		int m = (left+right)/2;
		mergeSortRec(A, left, m);
		mergeSortRec(A, m+1, right);
		merge(A, left, m, right);
	}
	
	private static void merge(int[] A, int left1, int right1, int right2) {
		int[] B = new int[right2-left1+1];
		int i = 0;
		int left2 = right1+1;
		int k = left1;
		
		while(left1 <= right1 && left2 <= right2) {
			if(A[left1] < A[left2]) {
				B[i++] = A[left1++];
			}else {
				B[i++] = A[left2++];
			}
		}
		
		if(left1 <= right1) {
			for(int j = left1; j <= right1; j++, i++) {
				B[i] = A[j];
			}
		}else {
			for(int j = left2; j <= right2; j++, i++) {
				B[i] = A[j];
			}
		}
		
		for(int t=0; k <= right2; k++, t++) {
			A[k] = B[t];
		}
		
	}

}
