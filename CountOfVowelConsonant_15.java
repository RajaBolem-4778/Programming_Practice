package Challenges;

import java.util.Scanner;

public class CountOfVowelConsonant_15 {

	public static void main(String[] args) {
		int vowel_count = 0, consonant_count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowel_count++;
			} else
				consonant_count++;
		}
		System.out.println("Number of vowels : " + vowel_count);
		System.out.println("Number of Consonants : " + consonant_count);

	}
}
