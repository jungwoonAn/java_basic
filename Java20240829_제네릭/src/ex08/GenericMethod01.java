package ex08;

class Box<T> {
	private T obj;

	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}	
}

class BoxFactory {
	// 제네릭 메서드는 타입 파라미터로 <T>를 정의해야 함
	public static <T> Box<T> markBox(T obj){
		Box<T> box = new Box<T>();
		box.setObj(obj);
		return box;
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.markBox("sweet");
		System.out.println(sBox.getObj());
		
		Box<Integer> iBox = BoxFactory.markBox(10);
		System.out.println(iBox.getObj());
	}

}
