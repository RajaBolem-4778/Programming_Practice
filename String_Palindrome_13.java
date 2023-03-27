package Challenges;

import java.util.Scanner;

public class String_Palindrome_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		boolean in = isPalindrome(str);
		if (in) {
			System.out.println(str + " is a palindrome string");
		} else {
			System.out.println(str + " is not a palindrome string");
		}

	}

	private static boolean isPalindrome(String str) {
		int i = 0;
		int size = str.length() - 1;
		while (i < size) {
			if (str.charAt(i) != str.charAt(size)) {
				return false;
			}
			i++;
			size--;
		}
		return true;
	}
}
