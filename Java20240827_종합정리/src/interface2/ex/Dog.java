package interface2.ex;

// Dog 는 AbstractAnimal 만 상속
public class Dog extends AbstractAnimal {

	@Override
	public void sound() {
		System.out.println("멍멍!");
	}

}
