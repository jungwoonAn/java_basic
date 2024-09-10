package count01;

import java.util.Arrays;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		// 스트림 API
		List<String> list = Arrays.asList("a","b","c");
		
		list.stream().forEach(a -> System.out.println(a));
	}

}
