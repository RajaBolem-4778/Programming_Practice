package Challenges;

import java.util.Scanner;

public class Challenge_2 {
	public static int isFactorial(int num) {

		int i = 1;
		int fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		isFactorial(n);
	}

}
