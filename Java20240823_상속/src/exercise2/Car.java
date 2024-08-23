package exercise2;

public class Car extends Vehicle {
	String fuelType;  // 연료 타입
	int seatingCapacity;  // 탑승 인원
	
	public Car(String licensePlate, String owner, String fuelType, int seatingCapacity) {
		super(licensePlate, owner);
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public double calculateMaintenanceCost() {
		double pee=10000 * seatingCapacity;		
		return pee;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("연료 타입 : " + fuelType);
		System.out.println("탑승 인원 : " + seatingCapacity);
		System.out.println("정비 비용 : " + calculateMaintenanceCost());
	}
}
