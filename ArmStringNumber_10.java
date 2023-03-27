package Challenges;

import java.util.Scanner;

public class ArmStringNumber_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean result = armStringNumbercheck(n);
		if (result == true) {
			System.out.println("ArmStrong Number");
		} else
			System.out.println("Non-ArmStrong Number");

	}

	private static boolean armStringNumbercheck(int n) {
		int temp, i = 0, rem = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			i++;
		}
		temp = n;
		while (temp > 0) {
			rem = temp % 10;
			sum += (Math.pow(rem, i));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

}
