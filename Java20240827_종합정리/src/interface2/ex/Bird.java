package interface2.ex;

// Bird 는 AbstractAnimal 클래스를 상속하고 Fly 인터페이스를 구현
public class Bird extends AbstractAnimal implements Fly {

	@Override
	public void sound() {
		System.out.println("짹짹");
	}

	@Override
	public void fly() {
		System.out.println("새 날기");
	}

}
