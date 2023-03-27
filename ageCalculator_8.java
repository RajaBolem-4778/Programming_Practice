package Challenges;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalculator_8 {

	public static void main(String[] args) {
		System.out.println(" Enter the date in YYYY-MM-DD format");
		Scanner sc = new Scanner(System.in);
		String dob = sc.nextLine();
		ageCalculator(dob);
		
	}

	private static void ageCalculator(String dob) {
		LocalDate dob_act = LocalDate.parse(dob);
		LocalDate today =LocalDate.now();
		System.out.println(today);
		System.out.println(Period.between(dob_act, today).getYears());
		System.out.println(Period.between(dob_act, today).getMonths());
		System.out.println(Period.between(dob_act, today).getDays());
		}

}
