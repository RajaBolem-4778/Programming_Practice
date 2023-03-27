package Challenges;

import java.util.Arrays;

public class FrequesncyOfElementsArray_31 {
	public static void main(String[] args) {
		int arr[] = new int[]{10,30,10,20,10,20,30,10};
		int n = arr.length;
		checkFrequency(arr,n);
}

	private static void checkFrequency(int[] arr, int n) {
		boolean check[] = new boolean[n];
		Arrays.fill(check, false);
		
		for(int i=0;i<n;i++) {
			if(check[i]==true) {
				continue;	
			}
			int count =1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					check[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " repeats " + count + " times ");
		}
	}
}
