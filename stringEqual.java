package Challenges;

import java.util.Scanner;

public class stringEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Enter the String-1: " + str1);
		String str2 = sc.nextLine();
		System.out.println("Enter the String-2: " + str2);
		boolean input1 = usingEquals(str1, str2);

		boolean input2 = usingEqualsIgnoreCase(str1, str2);
		boolean input3 = usingCompareTo(str1, str2);
		boolean input4 = withoutBuild_inFunctions(str1, str2);

		System.out.println("usingEquals--------------");
		if (input1) {
			System.out.println("Strings Equal");
		} else {
			System.out.println("Strings are not Equal");
		}
		System.out.println("usingEqualsIgnoreCase--------------");

		if (input2) {
			System.out.println("Strings Equal");
		} else {
			System.out.println("Strings are not Equal");
		}
		System.out.println("usingCompareTo--------------");

		if (input3) {
			System.out.println("Strings Equal");
		} else {
			System.out.println("Strings are not Equal");
		}
		System.out.println("withoutBuild_inFunctions--------------");

		if (input4) {
			System.out.println("Strings Equal");
		} else {
			System.out.println("Strings are not Equal");
		}
	}

	private static boolean withoutBuild_inFunctions(String str1, String str2) {
		boolean flag = false;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					flag = true;
				}
			}

		} else
			return false;
		return flag;
	}

	private static boolean usingEquals(String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		} else
			return false;
	}

	private static boolean usingEqualsIgnoreCase(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2)) {
			return true;
		} else
			return false;
	}

	private static boolean usingCompareTo(String str1, String str2) {
		if (str1 == str2) {
			return true;
		} else
			return false;
	}

}
