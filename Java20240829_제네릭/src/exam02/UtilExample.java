package exam02;

public class UtilExample {

	public static void main(String[] args) {
		
		Pair<String, Integer> pair = new Pair<>("홍길동", 25);
		
		Integer age = Util.getVaule(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childage = Util.getVaule(childPair, "홍삼순");
		System.out.println(childage);
		
		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//		int otherage = Util.getVaule(otherPair, "홍삼원");
		// OtherPair클래스는 Pair클래스를 상속받지 않아서 컴파일 에러 발생
		
		
	}

}
