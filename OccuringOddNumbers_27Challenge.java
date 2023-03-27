package Challenges;

import java.util.Arrays;

public class OccuringOddNumbers_27Challenge {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 3 };
		int n = arr.length;
		System.out.println(OddOccurance(arr, n));
	}

	private static int OddOccurance(int[] arr, int arr_size) {
		for (int i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;

			}
			if (count % 2 != 0)
				return arr[i];

		}

		return -1;

	}

}
