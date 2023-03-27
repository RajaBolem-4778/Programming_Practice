package Challenges;

import java.util.Scanner;

public class CustomException_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		try {
			getData(age);
		} catch (UnderAgeException e) {
			System.out.println("Age is less than 18, Rejected");
		} catch (OverAgeException e) {
			System.out.println("Age is more than 65, Rejected");
		}
	}


	private static void getData(int age) throws UnderAgeException, OverAgeException {
		// TODO Auto-generated method stub
		if (age > 65) {
			throw new OverAgeException("OverAgeException Occured");
		} else if (age < 18) {
			throw new UnderAgeException("UnderAgeException Occured");
		} else
			System.out.println("Accepted");

	}
}
