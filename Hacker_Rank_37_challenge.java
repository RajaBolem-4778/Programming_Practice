package com.skilllync.Programming_workshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Hacker_Rank_37_challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to School Management system");
		System.out.println("----------------");
		System.out.print("Number of classrooms in Delhi Public School : ");
		int num_ClassRoom = sc.nextInt();

		System.out.print("Number of students in each class are : ");
		int num_Students = sc.nextInt();

		setDetails(num_ClassRoom, num_Students);
		System.out.println("----------------");

		System.out.print("Number of classrooms in Cambridge Public School : ");
		num_ClassRoom = sc.nextInt();
		System.out.print("Number of students in each class are : ");
		num_Students = sc.nextInt();

		setDetails(num_ClassRoom, num_Students);
		System.out.println("----------------");
		sc.close();
	}

	private static void setDetails(int num_ClassRoom, int num_Students) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Student>> cls = new ArrayList<ArrayList<Student>>();

		for (int i = 0; i < num_ClassRoom; i++) {
			System.out.println("----------------");
			System.out.println("Class " + (i + 1) + " Details");
			System.out.println("----------------");
			ArrayList<Student> sd = new ArrayList<>();

			Student[] student = new Student[num_Students];
			for (int j = 0; j < num_Students; j++) {
				student[j] = new Student();
				System.out.println("Enter name for student " + (j + 1) + ": ");
				student[j].setName(sc.nextLine());
				System.out.println("Enter Feedback for student " + (j + 1) + ": ");
				student[j].setName(sc.nextLine());
				System.out.println();
				student[j].setStudentNumber(j + 1);
				student[j].setClassNumber(i + 1);

				sd.add(student[j]);
			}

			cls.add(sd);
		}

		System.out.println("-----------------");
		System.out.println("Detail of School ");
		System.out.println("-----------------");

		for (ArrayList<Student> classNum : cls) {
			for (Student student : classNum) {
				student.display();
			}
		}

	}
}

class Student {

	String name = new String();
	String feedback = new String();
	int studentNumber;
	int studentClass;

	public String getName() {
		return name;
	}

	public void setClassNumber(int i) {
		this.studentClass = i;
	}

	public void setStudentNumber(int j) {
		this.studentNumber = j;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {

		this.feedback = feedback;
	}

	public void display() {
		System.out.println("Student : " + studentNumber + " \nClass : " + studentClass + "\n Name : " + name
				+ "\nReview : " + feedback + "\n-------\n");
	}

}
