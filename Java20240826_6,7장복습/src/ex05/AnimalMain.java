package ex05;

public class AnimalMain {

	public static void main(String[] args) {
		speakTest(new Animal());
		speakTest(new Cat());
		speakTest(new Dog());
		speakTest(new Pug());
	}
	
	static void speakTest(Animal animal) {
		animal.speak();
	}

}
