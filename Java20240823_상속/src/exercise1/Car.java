package exercise1;

public class Car {
	String model;
	String color;
	int speed;
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	public void carInfo() {
		System.out.printf("차량 모델 : %s, 차량 색상 : %s\n", model, color);
	}
	
	public int speedUp() {
		System.out.printf("속도를 %d만큼 높입니다.\n", speed);
		return speed += 2;
	}
	
	// final method(자식 클래스는 오브라이딩 불가) 
	public final int stop() {
		System.out.println("차를 멈춤");
		return speed = 0;
	}	
	
}
