package ex05;

public class StudentMain {

	public static void main(String[] args) {
		
//		Student s1 = new Student();		
//		s1.setName("차은우");
//		System.out.println(s1.getName());
		
		// 정적 변수, 메서드는 객체생성 없이 사용가능
		System.out.println(Student.job);		
		System.out.println(Student.changeJob());
		
		// 자주 사용하는 정적 멤버
		System.out.println(Math.PI);
		System.out.println(Math.random());
	}

}
