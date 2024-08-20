package ex01;

public class ClassEx01 {

	public static void main(String[] args) {
		// 객체 생성
		Student stu1 = new Student();
		stu1.name = "홍길동";
		stu1.age = 25;
		stu1.phone = "010-2345-6789";
		
		stu1.info();		
		stu1.checkIn();
		stu1.checkOut();
		
		System.out.println("--------------");
		// 객체 생성
		Student stu2 = new Student();
		stu2.name = "성춘향";
		stu2.age = 17;
		stu2.phone = "010-2222-3344";
		
		stu2.info();		
		stu2.checkIn();
		stu2.leaveEaryl();
	}

}

// 클래스 선언
class Student {	 // 클래스 명 첫글자는 대문자, 변수및 함수는 소문자
	// 속성(필드) - 정적
	String name;
	int age;
	String phone;
	
	// 기능(메서드) - 동적
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s \n", name, age, phone);
	}
	
	void checkIn() {
		System.out.println("입실하다.");
	}
	
	void checkOut() {
		System.out.println("퇴실하다.");		
	}
	
	void leaveEaryl() {
		System.out.println("조퇴하다.");	
	}
	
}
