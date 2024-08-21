package ex01;

public class ClassEx02 {

	public static void main(String[] args) {
		// 객체 생성
		Student1 stu1 = new Student1();
//		stu1.name = "홍길동";
//		stu1.age = 25;
//		stu1.phone = "010-2345-6789";
		stu1.infoAge(25);
		
/*
 * 멤버변수는 외부에 공개하지 않는다.(private)
 * ex) 
 * int a; // 변수 선언
 * a = 10; // 변수 초기화
 * System.out.println(a); // 변수 a는 초기화 해야 사용가능하다.
 * 
 * 멤버변수는 반드시 초기화 해야 한다. 
 * 
 * 초기화하는 방법 2가지
 * 1. 생성자
 * 2. setter 이용
 */	

	}

}

/*
 * private < default < protected < public
 * private : 같은 클래스 내에서만 공개
 * default : 같은 package내에서만 공개
 * protected : 다른 package에서도 상속하면 공개
 * public : 모두 공개
 */

// 클래스 선언
class Student1 {	 // 클래스 명 첫글자는 대문자, 변수및 함수는 소문자
	// 속성(필드) - 정적
	private String name;
	private int age;
	private String phone;
	
	// 기능(메서드) - 동적
	// 필드 값에 제한을 줄 수 있음
	void infoAge(int age) {
		if(age>0 && age<=120) {
			this.age = age;
		}else {
			System.out.println("나이는 0~120세 사이만 입력가능");
		}
	}
	
}
