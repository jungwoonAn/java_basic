package interface1.ex1;

public class Dog implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("강아지가 움직임");
	}

}
