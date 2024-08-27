package interface2.ex;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();
		
		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);
		
		flyAnimal(bird);
		flyAnimal(chicken);
		
	}
	
	// 매개변수 다형성
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("= 동물 소리 테스트 시작 =");
		animal.sound();
		System.out.println("= 동물 소리 테스트 종료 =");
	}
	
	private static void flyAnimal(Fly fly) {
		System.out.println("< 날기 테스트 시작 >");
		fly.fly();
		System.out.println("< 날기 테스트 종료 >");
	}

}
