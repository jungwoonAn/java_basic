package ex13;

class A {}
class B extends A {}
class C extends B {}

class Box<T> {
	private T obj;

	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}	
	@Override
	public String toString() {
		return obj.toString();
	}
}

class BoxFactory {	
	// <? super B> -> 와일드카드 하한 제한
	// box에 대입할 수 있는 대상은 B클래스이거나 상위클래스만 가능
	// 기능 -> set만 가능 => 저장
	public static void peekBox(Box<? super B> box) {
		System.out.println(box);
		box.getObj(); 
		box.setObj(new B());
	}
}

public class LowerLimitWildCard01 {

	public static void main(String[] args) {
		
		Box<A> a = new Box();
		Box<B> b = new Box();
		Box<C> c = new Box();
		
		BoxFactory.peekBox(a);
		BoxFactory.peekBox(b);
//		BoxFactory.peekBox(c);  // error : 하한제한으로 접근 불가
		
	}

}
