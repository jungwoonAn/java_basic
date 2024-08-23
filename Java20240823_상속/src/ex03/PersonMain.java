package ex03;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동", 25);
		person.introduce();
		person.walk();
		
		System.out.println("--------------------");
		
		Student student = new Student("고길동", 20, "명성대학교","12345678");
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("--------------------");
		
		SalesMan salesman = new SalesMan("권율", 32, "삼성전자", 500);
		salesman.introduce();
		salesman.walk();
		salesman.work();
		
		System.out.println("--------------------");
		
		PartTimeStudent ptstudent = new PartTimeStudent();
		PartTimeStudent ptstudent2 = new PartTimeStudent("성춘향", 17, "수원고등학교", "23456789", "맥도날드", 10000);
		ptstudent2.introduce();
		ptstudent2.walk();
		ptstudent2.study();
		ptstudent2.walk();
		ptstudent2.work();
		
	}

}
