package com.skilllync.Programming_workshop;

interface Calculator {
	int add(int num1, int num2, int num3);
}

public class LambdaExpression_56 {
	public static void main(String[] args) {
		Calculator ad = (num1, num2, num3) -> (num1 + num2 + num3);
		System.out.println(ad.add(10, 20, 30));
	}
}
