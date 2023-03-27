package Challenges;

import java.util.Scanner;

public class SumOfFibonacci_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		int n1 = 0, n2 = 1, n3;
		int sum = 1;
		int i;
		for (i = 2; i < number; i++) {
			n3 = n1 + n2;
			sum += n3;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("Sum = " + sum);
	}

}
