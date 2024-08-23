package ex04;

// public final class Student extends Person -> 하위 클래스 생성 불가
public class Student extends Person{
	String school;
	String studentID;
	
	public Student() {}
	
	public Student(String school, String studentID) {
		super();  // 상위클래스 기본 생성자 호출(생략가능)
		this.school = school;
		this.studentID = studentID;
	}
	
	public Student(String name, int age, String school, String studentID) {
		super(name, age);  // 상위클래스 생성자 호출
		this.school = school;
		this.studentID = studentID;
	}

	// 메서드 오버라이딩
	@Override  // @ : 어노테션, 상위클래스 메서드 재정의
	public void introduce() {
		super.introduce();  // 상위클래스 메서드 호출
		System.out.printf("학교는 %s이고, 학번은 %s입니다.\n", school, studentID);
	}
	
	public void study() {
		System.out.println(name + "이(가) 공부를 하고 있습니다.");
	}
}
