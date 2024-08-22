package ex03;

public class Singleton {
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 선언
	// 다른 클래스에서 생성자를 통한 객체 생성(new) 불가
	private Singleton() {}
	
	// public 접근 권한을 갖는 정적 메서드 선언
	public static Singleton getInstance() {
		return singleton;
	}
}
