package ex03;

import java.util.HashSet;

class A {
	String id;
	int age;
	
	A(String id, int age){
		this.id = id;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		A a = (A)obj;
		return id.equals(a.id);
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(age);
	}
}

public class HashCodeMain {

	public static void main(String[] args) {
		
		A a1 = new A("Id1234", 20);
		A a2 = new A("Id1234", 20);
		A a3 = new A("Id1234", 24);
		
		System.out.println(a1.equals(a2));
		// hasCode(age) 비교 후 true이면 id.equals(a.id) 비교하여 결과 출력
		
		HashSet set = new HashSet();
		
		set.add(a1);
		set.add(a2);  // 같은 내용은 추가하지 않음
		set.add(a3);
		
		System.out.println(set); // set에 2개의 주소값을 가짐
		
		
	}

}
