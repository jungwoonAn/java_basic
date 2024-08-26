package interface1.ex1;

public class Cat implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("야옹~");
	}

	@Override
	public void move() {
		System.out.println("고양이 움직임");
	}

}
