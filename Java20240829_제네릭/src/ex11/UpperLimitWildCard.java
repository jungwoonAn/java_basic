package ex11;

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
	// <? extends Number> -> 와일드카드 상한 제한
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class UpperLimitWildCard {

	public static void main(String[] args) {
			
		Box<Integer> ibox = new Box();
		ibox.setObj(1234);
		BoxFactory.peekBox(ibox);
		
		Box<Double> dbox = new Box();
		dbox.setObj(12.15);
		BoxFactory.peekBox(dbox);
		
		Box<String> sbox = new Box();
		sbox.setObj("korea");
//		BoxFactory.peekBox(sbox);  // error
		
	}

}
