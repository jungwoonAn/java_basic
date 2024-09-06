package thread.start.test;

import static util.MyLogger.log;

public class StartTestMain04 {

	public static void main(String[] args) {
		// Thread 매개변수에 Runnable 익명객체 반복됨...		
		Thread thread1 = new Thread(() -> {
			while(true) {
				try {
					log("A");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Thread-A");
		
		Thread thread2 = new Thread(() -> {
			while(true) {
				try {
					log("B");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Thread-B");
		
		thread1.start();
		thread2.start();	
		
	}

}
