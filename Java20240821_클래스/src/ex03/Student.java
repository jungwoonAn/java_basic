package ex03;

public class Student {
	// 속성(필드) - 정적
	private String name;
	private int age;
	private String phone;
	
	// default 생성자 선언
	// 반복을 줄이기 위해 this() 사용
	Student(){
//		name = "고길동";
//		age = 35;
//		phone= "000-0000-0000";
		this("고길동", 35, "000-0000-0000");
		System.out.println("디폴트 생성자 호출");
	}
	
	// 생성자 오버로딩
	Student(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	Student(String name, int age){
//		this.name = name;
//		this.age = age;	
//		phone= "000-0000-0000";
		this(name, age, "000-0000-0000");
	}
	
	Student(String name){
//		this.name = name;
//		age = 20;
//		phone= "000-0000-0000";
		this(name, 20, "000-0000-0000");
	}
	
	// 기능(메서드) - 동적
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s \n", name, age, phone);
	}

}
