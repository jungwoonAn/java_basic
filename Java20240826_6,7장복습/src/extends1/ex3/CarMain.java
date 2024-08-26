package extends1.ex3;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar eCar = new ElectricCar();
		eCar.move();
		eCar.charge();
		eCar.openDoor();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();
		
		HydrogenCar hydroCar = new HydrogenCar();
		hydroCar.move();
		hydroCar.fillHydrogen();
		hydroCar.openDoor();
	}

}
