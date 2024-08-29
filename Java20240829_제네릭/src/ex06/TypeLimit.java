package ex06;

class A {}
class B extends A {}
class C extends B {}

class Box<T extends Number> {  
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
		Box<Double> dBox = new Box();		
		dBox.setObj(10.0);		

		Box<Integer> iBox = new Box();
		iBox.setObj(10);
 		
	}

}
