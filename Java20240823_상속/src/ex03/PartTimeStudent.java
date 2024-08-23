package ex03;

// 학생 중 알바하는 학생
public class PartTimeStudent extends Student {
	String job;
	int pay;
	
	public PartTimeStudent() {}
	
	public PartTimeStudent(String name, int age, String school, String studentID, String job, int pay) {
		super(name, age, school, studentID);
		this.job = job;
		this.pay = pay;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.printf("알바장소 : %s, 시급 : %d \n", job, pay);
	}

	public void work() {
		System.out.println(name + "이(가) 알바 중!");
	}
}
