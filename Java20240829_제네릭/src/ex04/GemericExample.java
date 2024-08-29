package ex04;

public class GemericExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		product1.setKind(new Tv());
		product1.setModel("smartTv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println("-----------------");
		
		Product<Car, Integer> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel(23456);
		
		Car car = product2.getKind();
		Integer carModel = product2.getModel();
	}

}
