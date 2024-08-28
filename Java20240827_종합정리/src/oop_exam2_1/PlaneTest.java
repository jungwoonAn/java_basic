package oop_exam2_1;

public class PlaneTest {

	public static void main(String[] args) {
		// 2개의 원소를 갖는 Plane 타입의 배열 객체를 생성 
		Plane[] planes = new Plane[2];
		
		// Airplane과 Cargoplane 객체를 생성하여 각 원소로 저장
		planes[0] = new Airplane("L747", 1000); 
		planes[1] = new Cargoplane("C40", 1000); 
				
		// 생성된 객체의 정보 출력
		printInfo(planes);
		
		// Airplane과 Cargoplane 객체에 100씩 운항 후 객체 정보 출력
		System.out.printf("\n[100 운항]\n");
		for(Plane plane : planes)
			plane.flight(100);
		
		printInfo(planes);
		
		// Airplane과 Cargoplane 객체에 200 주유 후 객체 정보 출력
		System.out.printf("\n[200 운항]\n");
		for(Plane plane : planes)
			plane.refuel(200);
		
		printInfo(planes);
	}
	
	public static void printInfo(Plane[] list) {
		// 타이틀 출력
		System.out.printf("  Plane\t fuelSize \n");
		System.out.println("-------------------");
		
		// Plane 객체들의 데이터 출력(출력 결과 참조)
		for(Plane plane : list) {
			System.out.printf("  %s\t %d \n", plane.getPlaneName(), plane.getFuelSize());
		}
		
	}

}
