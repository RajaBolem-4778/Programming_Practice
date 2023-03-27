package Challenges;

import java.util.Scanner;

public class ConvertIntoSeconds_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours");
		int n = sc.nextInt();

		int minutes = n * 60;
		int seconds = n * 3600;

		System.out.println(seconds);
	}
}
