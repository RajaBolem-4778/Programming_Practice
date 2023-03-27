package Challenges;

import java.util.Scanner;

abstract class Shape {
	double Area;

	abstract void input();

	abstract void calculate();

	void display() {
		System.out.println("Area = " + Area);
	}

}

class Circle extends Shape {

	double radius;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Radius of Circle : ");
		radius = sc.nextDouble();
	}

	void calculate() {
		Area = (3.14 * radius * radius);
	}
}

class Square extends Shape {

	private double side;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of Square : ");
		side = sc.nextDouble();
	}

	void calculate() {
		Area = side * side;
	}
}

class Rectangle extends Shape {

	private double length;
	private double bredth;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of Rectangle : ");
		length = sc.nextDouble();
		System.out.println("enter the breadth of Rectangle : ");
		bredth = sc.nextDouble();
	}

	void calculate() {
		Area = length * bredth;
	}

}

class Geometry {

	void allow(Shape s) {
		s.input();
		s.calculate();
		s.display();

	}

}

public class AreaOfGeometricShapres_12 {
	public static void main(String[] args) {
		Circle obj = new Circle();
		Square obj2 = new Square();
		Rectangle obj3 = new Rectangle();
		Geometry obj1 = new Geometry();
		obj1.allow(obj);
		obj1.allow(obj2);
		obj1.allow(obj3);
	}
}
