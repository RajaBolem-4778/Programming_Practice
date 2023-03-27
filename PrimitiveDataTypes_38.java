package com.skilllync.Programming_workshop;

import java.util.Scanner;

public class PrimitiveDataTypes_38 {
	
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			try {
				long x = sc.nextLong();
				if (x >= -128 && x <= 127) {
					System.out.print("byte,");
				}
				if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
					System.out.print(" short,");
				}
				if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
					System.out.print(" int,");
				}
				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
					System.out.print(" long");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted in the above data_types");
			}
		}
	}
}
