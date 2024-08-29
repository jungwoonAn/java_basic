package ex05;

class A {}
class B extends A {}
class C extends B {}

//class Box<T> {  // 1. 모든 박스를 만들 수 있음
class Box<T extends A> {  // 2. A클래스와 하위 클래스를 담는 박스만 만들 수 있음
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}	
}

// 타입 제한하기
public class TypeLimit {

	public static void main(String[] args) {
		Box<A> aBox = new Box();
		
		aBox.setObj(new A());
		A a = aBox.getObj();
		
		aBox.setObj(new B());
		B b = (B)aBox.getObj();
		
		aBox.setObj(new C());
		C c = (C)aBox.getObj();
		
		// 1번에서만 가능
		// 2번처럼 extend A로 타입에 제한을 두면
		// A클래스와 A의 하위클래스만 생성가능 
//		Box<String> sBox = new Box();		
//		Box<Integer> iBox = new Box();
 		
	}

}
