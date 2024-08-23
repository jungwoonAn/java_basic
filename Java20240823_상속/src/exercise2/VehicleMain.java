package exercise2;

public class VehicleMain {

	public static void main(String[] args) {
		Car car1 = new Car("123가 4567", "홍길동", "Gasoline", 5);
		car1.info();
		
		System.out.println();
		
		Truck truck1 = new Truck("789나 1011", "이순신", 10.0);
		truck1.info();
		
	}

}
