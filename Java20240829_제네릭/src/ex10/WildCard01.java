package ex10;

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
	public static <T> T OpenBox(Box<T> box){
		return box.getObj();
	}
	
	// ? -> 와일드카드 타입 파라미터
//	public static <T> void peekBox(Box<T> box) {
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class WildCard01 {

	public static void main(String[] args) {
		
		Box<String> box = new Box();
		box.setObj("sweet");
		BoxFactory.peekBox(box);
		
		Box<Integer> ibox = new Box();
		BoxFactory.OpenBox(ibox);
		
	}

}
