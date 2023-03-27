package Challenges;

import java.util.Scanner;

public class PasswordValidation_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		stringValidation(str);
	}

	private static void stringValidation(String s) {
		int cond1=0,cond2=0,cond3=0,cond4=0;
		if (s.length() >= 8 && s.length() <= 15) {
			for (int i = 0; i < s.length() - 1; i++) {
				if(s.contains(" ")) {
					System.out.println(" It's not a valid password ");
				}
				else{
					if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
						cond1++;
				}

				}
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					cond2++;

				}
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					cond3++;

				}
				if (s.charAt(i) >= 35 && s.charAt(i) <= 38) {
					cond4++;
				}
				
			}
			
		}
		else {
			System.out.println(" Invalid Password ");
		}
		if(cond1>0 && cond2>0 && cond3>0 && cond4>0) {
			System.out.println("Valid Password ");
		}
		else {
			System.out.println("Invalid Password ");
		}
	}
	
}
