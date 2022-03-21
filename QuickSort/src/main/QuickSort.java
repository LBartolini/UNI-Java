package main;

import java.util.Arrays;

public class QuickSort {

	private static void scambia(int[] v, int i, int j) {
		if(i == j) return;
		
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
	
	public static void quickSort(int[] A, int left, int right) {
		if(left >= right) return;
		
		if(right-left >= 2) {
			int[] arr = {A[left], A[(left+right)/2], A[right]};
			Arrays.sort(arr);
			
			A[left] = arr[0];
			A[(left+right)/2] = arr[1];
			A[right] = arr[2];
		}else {
			if(A[left] > A[right]) {
				int temp = A[right];
				A[right] = A[left];
				A[left] = temp;
			}
		}
		
		int i = partition(A, left, right);
		
	}
	
	private static int partition(int[] A, int left, int right) {
		if(right-left >= 2) {
			int perno = A[right-1];
			int i = left+1;
			int j = right-2;
			
			while(true) {
				while(A[i] < perno) {
					i++;
				}
				
				while(A[j] >= perno) {
					j--;
				}
				
				// da finire
			}
		}
		
		if(A[left] >= A[right]) {
			scambia(A, left, right);
		}
		
		return left;
	}
}
