package review;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new ClassA("홍길동", 20);
		System.out.println(obj.toString());  // Object 멤버만 접근 가능
		System.out.println(obj);
		
		System.out.println("------------");
		
		ClassA a = new ClassC();
		a.func();  // 오버라이드된 메서드는 생성된 객체의 메서드에 접근
				
		ClassB b = (ClassB)a;
		b.func();
		
		ClassA a1 = new ClassC("홍길동", 20, "남", "담넘기");
		System.out.println(a1.name);  // ClassA 멤버만 접근 가능
		System.out.println(a1.age);
		
		ClassB b1 = (ClassB)a1;  // ClassB로 타입변환해야 ClassB 멤버에 접근
		System.out.println(b1.gender);
	}

}