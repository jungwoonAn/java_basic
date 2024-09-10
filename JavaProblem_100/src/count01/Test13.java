package count01;

import java.util.function.Consumer;

public class Test13 {
	// 메서드 참조
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Consumer<String> consumer = Test13::print;
		consumer.accept("Hello");
	}
}
