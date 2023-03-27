package Challenges;

import java.util.Scanner;

public class ReverseStringWordByWord_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int count = 0;
		String s2 = " ";
		int arr_position = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		String arr[] = new String[count + 1];
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				s2 = s2 + str.charAt(i);
			} else {

				arr[arr_position] = s2;
				arr_position++;
				s2 = "";
			}
		}
		arr[arr_position] = s2;
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}