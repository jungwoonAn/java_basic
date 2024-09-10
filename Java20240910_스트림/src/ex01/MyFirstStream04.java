package ex01;

import java.util.ArrayList;
import java.util.List;

public class MyFirstStream04 {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDY", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		// 장난감 가격의 합
		int sum = list.stream()
					.mapToInt(price -> price.getPrice())
					.sum();
		
		System.out.println(sum);
		
		// 가격 5000이상만 출력
		list.stream()
			.filter(price -> price.getPrice() >= 5000)
			.mapToInt(price -> price.getPrice())
			.forEach(n -> System.out.print(n + " "));
		
		// 5000이상 가격의 합계
		int total = list.stream()
				.filter(price -> price.getPrice() >= 5000)
				.mapToInt(price -> price.getPrice())
				.sum();
		
		System.out.println("\n" + total);
	}

}
