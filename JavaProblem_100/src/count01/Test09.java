package count01;

// 제네릭 사용
class Box<T> {
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}

public class Test09 {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		
		box.setValue(10);
		System.out.println(box.getValue());
		
	}

}
