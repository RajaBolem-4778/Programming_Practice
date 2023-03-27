package Challenges;

public class ThirdLargestElementInArray_30 {
	public static int getThirdLargest(int[] a, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[n - 3];
	}

	public static void main(String args[]) {
		int a[] = { 1, 14, 2, 16, 10, 20 };
		System.out.println("The third Largest element is " + getThirdLargest(a, 6));
	}
}
