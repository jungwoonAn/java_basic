package ex03;

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

// 제네릭 기반의 클래스 정의
class Box<T> {
	private T fruit;

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}

public class FruitAndBox {

	public static void main(String[] args) {
		/*
		Box abox = new Box();
		abox.setFruit(new Apple());	
		Apple apple = (Apple)abox.getFruit();  // 강제 타입변환 필요!
		System.out.println(apple);
		
		abox.setFruit("new Apple());  // 다른 타입도 들어갈 수 있음!
		*/
		
		Box<Apple> abox = new Box<Apple>();
		abox.setFruit(new Apple());
		Apple apple = abox.getFruit();  // 강제 타입변환 필요 없음
		System.out.println(apple);

//		aBox.setObj("new Apple()");  // 다른 타입이 들어갈 수 없음(사용자 실수에 대비)

		Box<Orange> obox = new Box<Orange>();
		obox.setFruit(new Orange());
		Orange orange = obox.getFruit();
		System.out.println(orange);
		
//		obox.setFruit(new Apple());  // error
		
		Box<String> sbox = new Box<>();  // 문자열만 들어가는 박스를 만들 수도 있음
		sbox.setFruit("홍길동");
		String str = sbox.getFruit();
		System.out.println(str);
		
		// 제네릭으로 선언한 클래스는 다른 과일 박스도 만들 수 있음!!
				
	}

}
