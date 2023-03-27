package Challenges;

public class Swap_7 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("value of a Before Swap:" + a);
		System.out.println("value of b Before Swap:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a After the Swap:" + a);
		System.out.println("Value of a After the Swap:" + b);

	}
}
