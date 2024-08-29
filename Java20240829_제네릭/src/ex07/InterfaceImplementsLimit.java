package ex07;

interface Able{}

class B implements Able {}

class C {}

class Box<T extends Able> {  // 인터페이스 Able구현 클래스만 전달 가능!
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}	
}

public class InterfaceImplementsLimit {

	public static void main(String[] args) {
		Box<B> bBox = new Box();
		
//		Box<Integer> iBox = new Box();
//		Box<String> sBox = new Box();
//		Box<C> cBox = new Box();		
	}

}
