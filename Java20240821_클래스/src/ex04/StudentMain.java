package ex04;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();
 		s1.info();
 		
 		Student s2 = new Student("홍길동", 25, "010-2345-6789");
 		s2.info();
 		s2.nameInfo(); 	
 		s2.nameChange("이몽룡");
 		s2.nameInfo(); 	
 		
 		// getter, setter로 멤버변수 접근
 		s2.setName("짱구");
 		System.out.println(s2.getName());
 			
	}

}
