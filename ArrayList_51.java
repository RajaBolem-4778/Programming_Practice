package com.skilllync.Programming_workshop;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_51 {
	// Sachin, Dravid, Laxman, Ganguly, Dhoni, Rohith, Virat, Yuvraj, Bumrah
	public static void main(String[] args) {

		System.out.println("< ------------ >  Task-1 : Create Arraylist ");

		ArrayList<String> Players = new ArrayList<>(20);
		Players.add("Sachin");
		Players.add("Dravid");
		Players.add("Laxman");
		Players.add("Sachin");
		Players.add("Ganguly");
		Players.add("Dhoni");
		Players.add("Rohith");
		Players.add("Virat");
		Players.add("Yuvraj");
		Players.add("Bumrah");
		System.out.println("ArrayList: " + Players);

		System.out.println("< ------------ >  Task-2 : Print all the List of elements ");

		for (String Player : Players) {
			System.out.println(Player);
		}
		System.out.println("< ------------ >  Task-3 : 1.check List Empty");
		if (Players.isEmpty()) {
			System.out.println(" List of data is empty ");
		} else {
			System.out.println(" List is not empty");
		}
		System.out.println("< ------------ >  Task-3 : 2.Copy List to another List");

		ArrayList<String> Cricketers = new ArrayList<>(20);
		Cricketers.add("Shreyas");
		Cricketers.add("SuryaKumar");
		Collections.copy(Players, Cricketers);
		System.out.println("ArrayList : " + Players);

	}
}
