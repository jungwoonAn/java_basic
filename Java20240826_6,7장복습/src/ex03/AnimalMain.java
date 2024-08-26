package ex03;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal animal = new Animal("동물");
//		animal.info();
		
		Animal dog = new Dog();  // 자동 타입 변환
		dog.info();
		
		Animal cat = new Cat();  // 자동 타입 변환
		cat.info();
		System.out.println("------------");
		
		Dog dog2 = new Dog("쿠키",5);
		dog2.info();
		dog2.speak();
		
		Cat cat2 = new Cat("얌얌",2);
		cat2.info();
		cat2.speak();
	}

}
