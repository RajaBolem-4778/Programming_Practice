package Challenges;

import java.util.Scanner;

public class productOfNumbersinString_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int product = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				int s1 = Character.getNumericValue(str.charAt(i));
				product *= s1;
			}
		}
		System.out.println(product);

	}
}