package Challenges;

import java.util.Scanner;

public class Automorphic_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean result= isAutomorphic(n);
		System.out.println(result);
	
}

	private static boolean isAutomorphic(int n) {
		int sqr = n *n;
		while(n>0) {
			if((n%10) !=sqr%10) {
		return false;
	}
			n=n/10;
			sqr = sqr/10;
		}
		return true;
	}
}
