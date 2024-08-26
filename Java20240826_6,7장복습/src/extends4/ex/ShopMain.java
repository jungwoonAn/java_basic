package extends4.ex;

public class ShopMain {

	public static void main(String[] args) {
		Item book = new Book("JAVA", 10000, "han", "12345");
		Item album = new Album("앨범1", 15000, "seo");
		Item movie = new Movie("영화1", 18000, "감독1", "배우1");
		
		book.print();
		album.print();
		movie.print();
		
		int sum = book.getPrice() + album.getPrice() + movie.getPrice();
		System.out.println("상품 가격의 합 : " + sum);
	}

}
