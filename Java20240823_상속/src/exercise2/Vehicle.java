package exercise2;

public class Vehicle {
	String licensePlate;  // 차량번호
	String owner;  // 소유자
	
	public Vehicle(String licensePlate, String owner) {
		this.licensePlate = licensePlate;
		this.owner = owner;
	}

	// 차량 시동을 거는 메서드
	public void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	// 정비 비용을 계산하는 메서드
	public double calculateMaintenanceCost() {
		double pee=0;		
		return pee;
	}
	
	public void info() {
		System.out.println("차량번호 : " + licensePlate);
		System.out.println("소유자 : " + owner);
		startEngine();
	}
}
