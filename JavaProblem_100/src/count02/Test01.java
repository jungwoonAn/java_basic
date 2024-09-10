package count02;

//instanceof와 다형성

class Vehicle {}

class Car extends Vehicle {}

public class Test01 {

	public static void main(String[] args) {
		
		Vehicle v = new Car();
		
		if(v instanceof Vehicle) {
			System.out.println("v is a Vehicle");
		}
		
		if(v instanceof Car) {
			System.out.println("v is a Car");
		}
	}

}
