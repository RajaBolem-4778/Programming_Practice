package com.skilllync.Programming_workshop;

import java.util.LinkedList;

public class LinkedList_52 {

	public static void main(String[] args) {

		System.out.println("< ------Task-1------ >  Create LinkedList ");

		LinkedList<String> Players = new LinkedList<String>();
		// Ronaldo, Messi, Neymar, Mbappe, Giggs, Rooney, Chetri, Persie, Zlatan

		Players.add("Ronaldo");
		Players.add("Messi");
		Players.add("Neymar");
		Players.add("Mbappe");
		Players.add("Giggs");
		Players.add("Rooney");
		Players.add("Chetri");
		Players.add("Persie");
		Players.add("Zlatan");
		System.out.println("LinkedList: " + Players + "\n");

		System.out.println("< ------Task-2------ >  Print all the List of elements ");
		int count = 0;
		for (String Player : Players) {
			count += 1;
			System.out.println(Player);
		}
		System.out.println("< ------Task-3 :1.------ >  count of List of elements ");
		System.out.println("Number of palyers in the LinkedList = " + count + "\n");
		System.out.println("< ------Task-3 :2.------ >  Print all the List of elements after Removal : ");
		Players.remove("Rooney");
		Players.remove(2);
		System.out.println("LinkedList: " + Players);
	}

}
