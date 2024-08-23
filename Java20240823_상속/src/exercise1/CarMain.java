package exercise1;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("제네시스","검정");
		car.carInfo();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.stop();
		
		System.out.println("---------------------");
		
		Car sportcar = new SportsCar("페라리","빨강");
		sportcar.carInfo();
		sportcar.speedUp();
		sportcar.speedUp();
		sportcar.speedUp();
		sportcar.speedUp();
		sportcar.stop();
		
		System.out.println("---------------------");
		
		Car bus = new Bus("시내버스","초록");
		bus.carInfo();
		bus.speedUp();
		bus.speedUp();
		bus.speedUp();
		bus.speedUp();
		bus.stop();
		
		System.out.println("---------------------");
		
		Car taxi = new Taxi("택시","노랑");
		taxi.carInfo();
		taxi.speedUp();
		taxi.speedUp();
		taxi.speedUp();
		taxi.speedUp();
		taxi.stop();
	}

}
