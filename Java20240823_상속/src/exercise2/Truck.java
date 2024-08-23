package exercise2;

public class Truck extends Vehicle {
	double loadCapacity;  // 적재 용량: 단위는 톤
	
	public Truck(String licensePlate, String owner, double loadCapacity) {
		super(licensePlate, owner);
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double calculateMaintenanceCost() {
		double pee=20000 * loadCapacity;		
		return pee;
	}
	
	@Override
	public void info() {
		super.info();		
		System.out.println("적재 용량 : " + loadCapacity);
		System.out.println("정비 비용 : " + calculateMaintenanceCost());
	}
}
