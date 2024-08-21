package ex04;

public class Student {
	private String name;
	private int age;
	private String phone;
	
	Student(){
		System.out.println("디폴트 생성자 호출");
	}
	
	Student(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}	
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s \n", name, age, phone);
	}
	
	// 이름 호출(read - getter)
	void nameInfo() {
		System.out.println("이름 : " + name);
	}
	 
	// 이름 변경(writer - setter)
	void nameChange(String name) {
		this.name = name;
	}
	
	// 우클릭 -> Source -> Generate Getters and Setters...
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
