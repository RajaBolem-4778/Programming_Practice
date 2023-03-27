package Challenges;

import java.util.Scanner;

public class ProgrammingPattern_4_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value:");
		int n = sc.nextInt();

		for (int i = 1, p = 1; i <= n; i++, p++) {
			for (int j = i; j <= n; j++) {
				System.out.print("# ");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("$ ");
			}
			for (int z = 1; z < i; z++) {
				System.out.print(p + " ");
			}
			for (int z = 1; z <= i; z++) {
				System.out.print(p + " ");
			}
			for (int v = i; v <= n; v++) {
				System.out.print("# ");
			}

			System.out.println();
		}
	}
}
