package ex02;

public class StudentMain {

	public static void main(String[] args) {
		// new Student() -> 객체 생성 or 인스턴스 생성
		// Student() -> 생성자(함수) 호출
		Student s1 = new Student();  // default 생성자 호출
 		s1.info();
 		
 		Student s2 = new Student("홍길동", 25, "010-2345-6789");
 		s2.info();
 		
 		Student s3 = new Student("성춘향", 17, "010-9876-5432");
 		s3.info();
 		
 		Student s4 = new Student("이몽룡");
 		s4.info();
 		
 		Student s5 = new Student("짱구", 5);
 		s5.info();
 			
	}

}
