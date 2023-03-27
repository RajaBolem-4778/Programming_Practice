package Challenges;

public class SumOfDaigonalsOfMatrix_28 {

	private static void Sum_of_Diagonals(int[][] matrix, int N) {
		int PrincipalD = 0, SecondaryD = 0;
		for (int i = 0; i < N; i++) {
			PrincipalD += matrix[i][i];

			SecondaryD += matrix[i][N - (i + 1)];
		}

		System.out.println("Sum of Principal Diagonal:" + PrincipalD);
		System.out.println("Sum of Secondary Diagonal:" + SecondaryD);
	}

	static public void main(String[] args) {

		int[][] b = { { 4, 5, 6, 7 }, { 1, 7, 3, 4 }, { 11, 12, 13, 14 }, { 23, 24, 25, 50 } };

		Sum_of_Diagonals(b, 4);
	}
}
