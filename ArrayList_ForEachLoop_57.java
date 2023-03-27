package com.skilllync.Programming_workshop;

import java.util.ArrayList;

public class ArrayList_ForEachLoop_57 {
	// 100, 50, 125, 175, 45, 225, 500, 25, 75, 15, 150, 5
	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<>();
		Numbers.add(100);
		Numbers.add(50);
		Numbers.add(125);
		Numbers.add(175);
		Numbers.add(45);
		Numbers.add(225);
		Numbers.add(500);
		Numbers.add(25);
		Numbers.add(75);
		Numbers.add(15);
		Numbers.add(150);
		Numbers.add(5);
		System.out.println("ArrayList: " + Numbers);
		for (Integer Number : Numbers) {
			System.out.println(Number);
		}
	}

}
