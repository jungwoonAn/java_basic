package thread.start.test;

import static util.MyLogger.log;

public class StartTestMain03 {

	public static void main(String[] args) {
				
		// Runnable 구현체 없이 람다식으로
		Thread thread = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				try {
					log("value : " + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();		
	}

}
