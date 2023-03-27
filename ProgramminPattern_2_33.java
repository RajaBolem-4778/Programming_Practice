package Challenges;

public class ProgramminPattern_2_33 {
	public static void display() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		display();
	}
}
