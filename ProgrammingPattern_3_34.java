package Challenges;

public class ProgrammingPattern_3_34 {

	public static void main(String args[]) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			int counter = i;
			for (int j = 1; j <= n; j++) {
				System.out.print(counter + " ");
				counter = counter + n;
			}
			System.out.println();
		}
	}
}
