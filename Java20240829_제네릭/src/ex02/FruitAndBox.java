package ex02;

// Object클래스(상위클래스)로 타입 선언
class Apple {
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box {
	private Object fruit;

	public Object getFruit() {
		return fruit;
	}

	public void setFruit(Object fruit) {
		this.fruit = fruit;
	}
	
}

public class FruitAndBox {

	public static void main(String[] args) {
		Box abox = new Box();  // 사과 담는 박스
		Box obox = new Box();  // 오렌지 담는 박스
		
		abox.setFruit(new Apple());  // 사과박스에 사과 넣기		
		obox.setFruit(new Orange());  // 오렌지박스에 오렌지 넣기
		
		Apple apple = (Apple)abox.getFruit();  // 꺼낼때는 강제 타입변환 필요
		Orange orange = (Orange)obox.getFruit();
		
		System.out.println(apple);
		System.out.println(orange);
		System.out.println("------------------");
		
		abox.setFruit("new Apple()");  // 문제! Object는 String도 받아줌
//		Apple apple2 = (Apple)abox.getFruit();
//		System.out.println(apple2);  //class java.lang.String cannot be cast to class ex02.Apple
		String apple2 = (String)abox.getFruit();
		System.out.println(apple2);
		System.out.println(abox.getFruit());
		
		abox.setFruit(new Orange());  // 문제!! 사과박스에 오렌지도 들어감!!!
//		Apple apple3 = (Apple)abox.getFruit();
//		System.out.println(apple3);  // error
		
		Orange orange2 = (Orange)obox.getFruit();
		System.out.println(orange2);		
				
	}

}
