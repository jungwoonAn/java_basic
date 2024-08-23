package ex04;

public class PersonMain {

	public static void main(String[] args) {

		/*
		 * 변수의 형변환
		 double d1 = 10.2;
		 int num = 10;		
//		 num = d1;  // 컴파일 오류 -> 강제로 형변환 필요
		 d1 = num;  // 자동 형변환 d1 = (double)num;
		 */
		
		// 상위클래스는 하위클래스를 참조할 수 있다.(단, 상위클래스 멤버만 접근 가능)
		Person person = new Person();		
		Person student = new Student();		
		Person ptstudent = new PartTimeStudent();
		
		// 강제 타입변환
		// 하위클래스는 상위클래스를 참조할 수 없다.
		Student student1 = new Student();
		Student student2 = new PartTimeStudent();
//		Student student3 = new Person();  // error
		
		PartTimeStudent ptstudent1 = new PartTimeStudent();
//		PartTimeStudent ptstudent2 = new Student();  // error
//		PartTimeStudent ptstudent3 = new Person();  // error		
		
	}

}
