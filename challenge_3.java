package Challenges;

import java.util.Scanner;

public class challenge_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		sumUsingloop(n);
		int sum = sumUsingRecursion(n);
		System.out.println("sumUsingRecursion = " + sum);
		sumUsingAP(n);
		System.out.println("sumUsingAP = " + sum);
		sumUsingloop(n);
		System.out.println("sumUsingloop = " + sum);

	}

	public static int sumUsingAP(int n) {
		int sum;
		sum = n * (n + 1) / 2;
		return sum;
	}

	public static int sumUsingRecursion(int n) {
		if (n != 0)
			return n + sumUsingRecursion(n - 1);
		else
			return n;
	}

	public static int sumUsingloop(int n) {
		int i;
		int sum = 0;
		for (i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
