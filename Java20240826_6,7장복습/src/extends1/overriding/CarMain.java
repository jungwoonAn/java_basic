package extends1.overriding;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar eCar = new ElectricCar();
		eCar.move();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		
	}

}
