package oop_exam2_1;

public class Airplane extends Plane {
	
	public Airplane() {}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		int fuelWast = getFuelSize() - distance*3;
		setFuelSize(fuelWast);
	}

}
