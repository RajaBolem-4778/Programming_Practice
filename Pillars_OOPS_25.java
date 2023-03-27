package Challenges;

import java.util.Scanner;

public class Pillars_OOPS_25 {

	public static void main(String[] args) {
		Airport a = new Airport();
		a.runAllFuncionality();
	}
}

class Airport {
	private final Scanner sc = new Scanner(System.in);

	void runAllFuncionality() {
		System.out.println("* Welcome to Airport *");
		while (true) {
			System.out.println("Can i know Which Plane do you want to see ");
			System.out.println("Please select number 1.CargoPlane, 2.PassengerPlane, 3.FighterPlane, 4. Exit ");
			int choice = sc.nextInt();
			if (choice == 1) {
				Plane c = new CargoPlane();
				Permit(c);
			} else if (choice == 2) {
				Plane p = new PassengerPlane();
				Permit(p);
			} else if (choice == 3) {
				Plane f = new FighterPlane();
				Permit(f);
			} else if (choice == 4) {
				System.out.println("* Thanks for visiting My program *");
				sc.close();
				break;
			} else {
				System.out.println("Invalid input Please enter correctly try again ");
			}
		}
	}

	private void Permit(Plane p) {
		System.out.println("-----------------------------");
		p.fly();
		p.land();
		System.out.println("-----------------------------");
	}
}

abstract class Plane extends Airport {
	private String PlaneType;

	void takeOff() {
		System.out.println("Plane took off");
	}

	abstract void fly();

	void land() {
		System.out.println(this.getPlaneType() + "land off");
	}

	public String getPlaneType() {
		return PlaneType;
	}

	public void setPlaneType(String planeType) {
		PlaneType = planeType;
	}
}

class CargoPlane extends Plane {
	void fly() {
		super.takeOff();
		System.out.println("Cargo Plane fly at low heights");
		carryGoods();
		super.setPlaneType("Cargo Plane");
	}

	private void carryGoods() {
		System.out.println("Cargo Plane Carry goods");
	}
}

class PassengerPlane extends Plane {
	void fly() {
		super.takeOff();
		System.out.println("Passenger Plane fly at medium heights");
		carryPassenger();
		super.setPlaneType("Passenger Plane");
	}

	private void carryPassenger() {
		System.out.println("Passenge rPlane Carry Passengers");
	}
}

class FighterPlane extends Plane {
	void fly() {
		super.takeOff();
		System.out.println("Fighter Plane fly at medium heights");
		CarryWeapons();
		super.setPlaneType("Fighter Plane");
	}

	private void CarryWeapons() {
		System.out.println("FighterPlane Carry Weapons");
	}
}
