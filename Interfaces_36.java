package Challenges;

import java.util.Scanner;

interface Calculator {
	void add(int a, int b);

	void sub(int a, int b);

	void mul(int a, int b);

}

public class Interfaces_36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator cal = new Calculator() {

			public void add(int a, int b) {
				int c = a + b;
				System.out.println("sum=" + c);
			}

			public void sub(int a, int b) {
				int c = a - b;
				System.out.println("subtraction=" + c);
			}

			public void mul(int a, int b) {
				int c = a * b;
				System.out.println("mul=" + c);

			}

		};
		System.out.println("Select the calculation : ");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the value of A : ");
			int a = sc.nextInt();
			System.out.println("Enter the value of B : ");
			int b = sc.nextInt();
			cal.add(a, b);
		} else if (choice == 2) {
			System.out.println("Enter the value of A : ");
			int a = sc.nextInt();
			System.out.println("Enter the value of B : ");
			int b = sc.nextInt();

			cal.sub(a, b);
		} else if (choice == 3) {
			System.out.println("Enter the value of A : ");
			int a = sc.nextInt();
			System.out.println("Enter the value of B : ");
			int b = sc.nextInt();
			cal.mul(a, b);
		}

	}

}
