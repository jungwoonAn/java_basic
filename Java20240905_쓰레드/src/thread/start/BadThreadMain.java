package thread.start;

public class BadThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() start");
		
		// 쓰레드 생성
		HelloThread helloThread = new HelloThread();
		System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
		
		helloThread.run(); // 메인 쓰레드에서 호출
		System.out.println(Thread.currentThread().getName() + " : start() 호출 후");
		
		System.out.println(Thread.currentThread().getName() + " : main() end");
		
	}

}
