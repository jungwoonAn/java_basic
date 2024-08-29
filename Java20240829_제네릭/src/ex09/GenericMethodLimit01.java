package ex09;

class Box<T> {
	private T obj;

	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}	
}

class BoxFactory {
	// 제네릭 메서드 타입 제한
	// <T extends Number> : Integer, Long, Double ...
	public static <T extends Number> Box<T> markBox(T obj){
		Box<T> box = new Box<T>();
		box.setObj(obj);
		return box;
	}
}

public class GenericMethodLimit01 {

	public static void main(String[] args) {
		
		Box<Integer> iBox = BoxFactory.markBox(1000);  // 매개변수는 박싱됨:markBox(new Integer(1000))
		System.out.println(iBox.getObj());
		
		Box<Double> dBox = BoxFactory.markBox(15.25);
		System.out.println(dBox.getObj());
	}

}
