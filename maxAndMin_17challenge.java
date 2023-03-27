package Challenges;

import java.util.Scanner;

public class maxAndMin_17challenge {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array elements" + (i));
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Array Elements:" + arr[i]);
		}
		System.out.println();
		findMax(arr);
		findMin(arr);
	}

	private static void findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if ((i+1) < (arr.length)) {
				if (min > arr[i + 1]) {
					min = arr[i+1];
				}
			}
		}
		System.out.println("Minimum value =" +min);
	}

	private static void findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if ((i + 1) < (arr.length-1)) {
			if (max < arr[i + 1]) {
				max=arr[i+1];
			}
		}
	}
		System.out.println("Maximum value =" +max);
}
}
