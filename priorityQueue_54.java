package com.skilllync.Programming_workshop;

import java.util.PriorityQueue;

public class priorityQueue_54 {
	public static void main(String[] args) {
		// 100, 50, 125, 175, 45, 225, 500, 25, 75, 15, 150, 5
		System.out.println(
				"Task-1: ----> create a new PriorityQueue, add some integer data and print out the collection ");
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		PQ.add(100);
		PQ.add(50);
		PQ.add(125);
		PQ.add(175);
		PQ.add(45);
		PQ.add(225);
		PQ.add(500);
		PQ.add(25);
		PQ.add(75);
		PQ.add(15);
		PQ.add(150);
		PQ.add(5);
		System.out.println("PriorityQueue : " + PQ + "\n");
		System.out.println("Task-2: ----> all elements in the PriorityQueue using iterators and print them ");

		for (Integer pq : PQ) {
			System.out.println(pq);
		}
		System.out.println("\n");

		PQ.poll();
		System.out.println("Task-3.2: ----> Print the element with the highest priority and remove it from the Queue ");
		System.out.println("PriorityQueue : " + PQ + "\n");

		System.out.println("Task-3.3: ----> find the class to which the given list belongs.");
		System.out.println(PQ.getClass() + "\n");
	}
}
