package ex05;

public class PersonMain {

	public static void main(String[] args) {

		// 자동 타입변환
		// 상위클래스는 하위클래스를 참조할 수 있다.(단, 상위클래스 멤버만 접근 가능)
		Person person = new Person();		
		
//		Student student1 = new Person();  // 사용불가
		
		/*
		 * 하위클래스는 상위클래스를 참조할 수 없다.
		 * 이유 : student1은 타입이 Student이므로
		 * Student와 Person정보를 다 사용할 수 있다.
		 * 그러나 Person객체를 참조하여 상위클래스 멤버에 기능이 제한된다.
		 * 강제 타입변환하게 되면 Student객체의 모든 기능 사용 가능!
		 */
		// 강제 타입변환
		Person student = new Student();		
		Student student1 = (Student)student;
		
		Person ptstu = new PartTimeStudent();
		PartTimeStudent ptstud1 = (PartTimeStudent)ptstu;
	}

}
