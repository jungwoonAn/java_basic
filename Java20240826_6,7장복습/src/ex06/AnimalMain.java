package ex06;

public class AnimalMain {

	public static void main(String[] args) {
		// 추상 클래스(미완성) -> 인스턴스(객체) 생성 불가
//		Animal animal = new Animal("동물");
//		animal.info();
		
		Dog dog = new Dog("쿠키",5);
		dog.info();
		dog.speak();
		
		Cat cat = new Cat("얌얌",2);
		cat.info();
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}

}
