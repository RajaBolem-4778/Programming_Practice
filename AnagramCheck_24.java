package Challenges;

import java.util.Arrays;

public class AnagramCheck_24 {
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s1_mod = "";
		String s2 = "CDBA";
		String s2_mod = "";

		if (s1.length() == s2.length()) {
			for (int i = 0; i <= s1.length() - 1; i++) {
				if (s1.charAt(i) == ' ') {

				} else {
					s1_mod = s1_mod + s1.charAt(i);
				}
			}
			for (int i = 0; i <= s2.length() - 1; i++) {
				if (s2.charAt(i) == ' ') {

				} else {
					s2_mod = s2_mod + s2.charAt(i);
				}
			}
			s1_mod = s1_mod.toUpperCase();
			s2_mod = s2_mod.toUpperCase();

			char[] s1_arr = s1_mod.toCharArray();
			char[] s2_arr = s2_mod.toCharArray();

			Arrays.sort(s1_arr);
			Arrays.sort(s2_arr);

			if (Arrays.equals(s1_arr, s2_arr) == true) {
				System.out.println("String are Anagrams ");
			} else {
				System.out.println("Strings are not anagrams");
			}
		}
	}
}
