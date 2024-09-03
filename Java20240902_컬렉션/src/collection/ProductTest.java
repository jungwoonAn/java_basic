package collection;

import java.util.HashSet;
import java.util.Set;

public class ProductTest {
	
	static Set<Product> products = new HashSet<Product>();

	public static void main(String[] args) {
		
		addProduct(new Product("p100","TV","20000"));
		addProduct(new Product("p200","Computer","10000"));
		addProduct(new Product("p100","MP3","700"));
		addProduct(new Product("p300","Audio","1000"));
				
		// 출력
		System.out.printf("제품ID\t 제품명\t 가격 \n");
		System.out.println("-----------------------------");
		
		for(Product p : products) {
			System.out.printf("%s\t %-10s %s\t \n", p.getProductID(), p.getProductName(), p.getProductPrice());
		}

	}
	
	static void addProduct(Product product) {
		if(products.contains(product)) {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}else {
			products.add(product);
			System.out.println("성공적으로 저장되었습니다.");
		}
	}

}
