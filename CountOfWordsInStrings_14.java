package Challenges;

import java.util.Scanner;

public class CountOfWordsInStrings_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < (str.length() - 1); i++) {
			if (str.charAt(i) == ' ' && Character.isLetter(str.charAt(i + 1)) && (i > 0)) {
				count++;
			}
		}
		count++;
		System.out.println("Total Number of words in the String= " + count);
	}

}
