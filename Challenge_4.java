// Program to print all the even numbers with given number and return in array

package Challenges;

import java.util.Scanner;

public class Challenge_4 {

	private static void EvenNumbersInArray(int n) {
		int[] arr = new int[n];
		int count = 0;
		for (int i = 1; i <= (2 * n); i++) {
			if ((i ^ 1) == (i + 1)) {
				arr[count] = i;
				count++;
			}
		}
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		EvenNumbersInArray(n);
	}

}
