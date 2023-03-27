package com.skilllync.Programming_workshop;

import java.util.TreeSet;

public class TreeSet_55 {
	public static void main(String[] args) {
		System.out.println("Task-1 : Creation of TreeSet ");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(50);
		ts.add(125);
		ts.add(175);
		ts.add(45);
		ts.add(225);
		ts.add(500);
		ts.add(25);
		ts.add(75);
		ts.add(15);
		ts.add(150);
		ts.add(5);
		System.out.println("TreeSet : " + ts);
		System.out.println("Task-2 : Iterating the Elements in the TreeSet");
		for (Integer t : ts) {
			System.out.println(t);
		}
		System.out.println("Task-3.1: Print the set in descending order \n" + ts.descendingSet());
		System.out.println("Task-3.2:Print the elements greater than given element\n" + ts.higher(200));

		System.out.println("Task-3.2:Print the elements less than given element\n" + ts.lower(200));

		System.out.println("Task-3.3: find the class to which the given list belongs \n " + ts.getClass());

		System.out.println("Task-3.4: SubSet within given range \n " + ts.subSet(200, 700));
	}
}
