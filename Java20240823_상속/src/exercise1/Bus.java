package exercise1;

public class Bus extends Car {
	Bus(String model, String color){
		super(model, color);
	}
	
	@Override
	public int speedUp() {
		super.speedUp();
		return speed -= 1;
	}
}
