package ex05;

public class InstanceOfEx {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal pug = new Pug();
		
		System.out.println(dog instanceof Animal);  // dog인스턴스는 Animal클래스를 참조한다.
		System.out.println(pug instanceof Dog);  // pug인스턴스는 Dog클래스를 참조한다.
		System.out.println(pug instanceof Animal);  // pug인스턴스는 Dog클래스를 참조한다.
	}

}
