package thread.start;

public class HelloRunnableMain {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() start");
		
//		HelloRunnable runnable = new HelloRunnable();
//		Thread thread = new Thread(runnable);
		
		// 구현객체 생성 없이 람다식 사용
		Thread thread = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " : run()");
		});
		
		thread.start();
		
		System.out.println(Thread.currentThread().getName() + " : main() end");
		
	}
}
