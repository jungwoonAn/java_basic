package exercise1;

public class SportsCar extends Car {
	
	SportsCar(String model, String color){
		super(model, color);
	}
	
	@Override
	public int speedUp() {
		super.speedUp();
		return speed += 1;
	}
}
