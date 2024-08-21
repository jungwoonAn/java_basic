package ex05;

public class Student {
	private String name;
	private int age;
	private String phone;
	
	// 정적 변수
	static String job="actor";
	
	// 정적 메서드
	static String changeJob() {
		job = "talent";
		return job;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
