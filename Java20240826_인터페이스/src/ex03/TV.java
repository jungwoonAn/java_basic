package ex03;

public interface TV {
	int MAX_SOUND = 100;  // public final
	int MIN_SOUND = 0;
	// 추상 메서드
	void powerOn();  // public abstract 생략 
	void powerOff();
	void soundUp();
	void soundDown();
	
	// 채널 변경 추가  // 기존 기능은 잘 동작함. 이후에 기능 추가
	// 디폴트 메서드로 추가하면 제품별로 메서드 추가 구현할 필요 없음
	default void channelUp() {
		System.out.println("채널을 올렸습니다.");
	}
	
	default void channelDown() {
		System.out.println("채널을 내렸습니다.");
	}
}
