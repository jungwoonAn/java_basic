package ex02;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal("동물");  // 객체생성, 인스턴스 생성
		animal.info();
		
		Animal animal2 = new Animal();
		animal2.info();
		
	}

}
