package Challenges;

public class MissingNumberInArray_26Challenge {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 4, 6, 3, 7, 8 };
		int n = arr.length;
		findMissingNumber(arr, n);
	}

	private static void findMissingNumber(int[] arr, int n) {
		int temp[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			temp[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			temp[arr[i] - 1] = 1;
		}
		int number = 0;
		for (int i = 0; i < n; i++) {
			if (temp[i] == 0) {
				number = i + 1;
			}
		}
		System.out.println(number);
	}
}
