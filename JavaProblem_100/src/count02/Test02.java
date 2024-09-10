package count02;

//super 키워드

class Parent {
	void display() {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	@Override
	void display() {		
		super.display();
		System.out.println("Child class");
	}
}

public class Test02 {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}
