package Challenges;

import java.util.Scanner;

public class SumOfArrayElements_16 {

	public static void main(String[] args) {
		int sum=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Array elements"+(i));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array Elements:" +arr[i]);
	}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("Sum of numbers in the even positions= "+sum);
}
}
