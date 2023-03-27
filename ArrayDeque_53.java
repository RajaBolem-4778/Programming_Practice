package com.skilllync.Programming_workshop;

import java.util.ArrayDeque;
import java.util.Collections;

public class ArrayDeque_53 {

	public static void main(String[] args) {

		System.out.println("< ------Task-1------ >  Create ArrayDeque : ");

		ArrayDeque<String> Actors = new ArrayDeque<String>();
		// Rajkumar, Amitab, Rajnikanth, Sharukh, Puneeth, Vijay, Surya, Chiranjeevi,
		// Salman

		Actors.add("Rajkumar");
		Actors.add("Amitab");
		Actors.add("Rajnikanth");
		Actors.add("Sharukh");
		Actors.add("Puneeth");
		Actors.add("Vijay");
		Actors.add("Surya");
		Actors.add("Chiranjeevi");
		Actors.add("Salman");

		System.out.println("ArrayDeque : " + Actors);
		System.out.println("< ------Task-2------ >  Print all the List of elements ");

		for (String actor : Actors) {
			System.out.println(actor);
		}
		System.out.println("< ------Task-3.1------ >  Adding elements in the front position ");
		Actors.addFirst("Vishnu");
		Actors.addFirst("Ambreesh");
		Actors.addFirst("Shivaji");
		System.out.println("ArrayDeque Actors : " + Actors);

		System.out.println("< ------Task-3.2------ >  copy contents from one list to another ");
		ArrayDeque<String> Mov_Act = Actors.clone();
		System.out.println("ArrayDeque Mov_Act : " + Mov_Act);
	}

}
