package ex03;

public class SingletonMain {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();  // 생성자가 private -> 컴파일 에러
		
		// 정적 메서드를 호출해서 싱글톤 객체 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// 동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("obj1 : " + obj1);
			System.out.println("obj2 : " + obj2);
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");			
		}
	}

}
