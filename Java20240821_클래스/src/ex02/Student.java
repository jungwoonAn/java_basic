package ex02;

public class Student {
	// 속성(필드) - 정적
	private String name;
	private int age;
	private String phone;
	
	// default 생성자 선언
	// 클래스에 생성자 선언이 없으면 컴파일러가 기본 생성자를 자동으로 추가
	// 명시적으로 선언한 생성자가 있으면 컴파일러는 기본 생성자를 추가하지 않는다.
	Student(){
		System.out.println("디폴트 생성자 호출");
	}
	
	// 생성자 오버로딩
//	Student(String n, int a, String p){
//		name = n;
//		age = a;
//		phone = p;
//	}
	Student(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	Student(String name, int age){
		this.name = name;
		this.age = age;	
		phone= "000-0000-0000";
	}
	
	Student(String name){
		this.name = name;
		age = 20;
		phone= "000-0000-0000";
	}
	
	// 기능(메서드) - 동적
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s \n", name, age, phone);
	}
	
}
