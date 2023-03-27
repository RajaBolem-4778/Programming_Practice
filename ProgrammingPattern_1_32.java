package Challenges;

public class ProgrammingPattern_1_32 {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}
		int i, j, k;
		for (i = 1; i <= rows; i++) {
			for (j = i; j <= rows - 1; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == rows || k == (2 * i - 1)) {
					System.out.print("@" + " ");
				} else {
					System.out.print("*" + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
