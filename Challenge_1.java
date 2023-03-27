package Challenges;

import java.util.Scanner;

public class Challenge_1 {

	public static boolean isPrime(int num) {
		int i;
		boolean b = true;
		if (num == 0 || num == 1) {
			b = true;
		} else

			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					b = false;
					break;
				}
			}
		System.out.println(b);
		return b;

	}

	public static void main(String[] args) {
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		flag = isPrime(n);
	}
}
