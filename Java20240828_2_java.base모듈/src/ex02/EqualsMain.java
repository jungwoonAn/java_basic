package ex02;

class A {
	String id;
	
	A(String id){
		this.id = id;
	}
	
	// 객체 값이 같은지 비교하기 위해 equals() 재정의
	@Override
	public boolean equals(Object obj) {
		A a = (A)obj;
		return id.equals(a.id);
	}
}

public class EqualsMain {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		
		// 기본 타입 값 비교 ==
		System.out.println(str1 == str2);  // false
		// 동등 객체 비교 .equals()
		System.out.println(str1.equals(str2));  // String은 값이 같으면 true
		System.out.println("-----------------");
		
		A a1 = new A("Id1234");
		A a2 = new A("Id1234");
		A a3 = a2;
		
		// 객체의 주소값 비교  // false
		System.out.println(a1.equals(a2));
		// B클래스에서 equals() 재정의 후  // true
		
		// 객체의 주소값 비교  // true
		System.out.println(a2 == a3);
		System.out.println(a2.equals(a3));  
	}

}
