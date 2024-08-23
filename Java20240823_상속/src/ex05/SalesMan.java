package ex05;

public class SalesMan extends Person{
	private String company;
	private int salary;
	
	public SalesMan(String name, int age, String company, int salary) {
		super(name, age);  // 상위클래스 생성자 호출
		this.company = company;
		this.salary = salary;
	}
	
	// 메서드 오버라이딩
	@Override
	public void introduce() {
		super.introduce();  // 상위클래스 메서드 호출
		System.out.printf("제 회사는 %s이고, 급여는 %s입니다.\n", company, salary);
	}
	
	public void work() {
		System.out.println(name + "이(가) 일하고 있습니다.");
	}

}
