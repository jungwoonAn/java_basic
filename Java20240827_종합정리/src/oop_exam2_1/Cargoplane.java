package oop_exam2_1;

public class Cargoplane extends Plane {
	
	public Cargoplane() {}
		
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		int fuelWast = getFuelSize() - distance*5;
		setFuelSize(fuelWast);
	}

}
