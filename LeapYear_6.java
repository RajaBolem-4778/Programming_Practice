package Challenges;

import java.util.Scanner;

public class LeapYear_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int n = scanner.nextInt();
		// isLeapYear(n);
		boolean result = isLeapYear(n);
		System.out.println(result);

	}

	private static boolean isLeapYear(int n) {
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					return true;
				} else
					return false;
			} else
				return true;
		} else
			return false;
	}
}
