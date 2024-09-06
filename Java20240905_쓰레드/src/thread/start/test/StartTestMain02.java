package thread.start.test;

import static util.MyLogger.log;

public class StartTestMain02 {

	public static void main(String[] args) {
		
		CounterRunnable counter = new CounterRunnable();
		Thread thread = new Thread(counter);
		thread.start();
		
	}
	
	static class CounterRunnable implements Runnable {
		@Override
		public void run() {
			for(int i=1; i<=5; i++) {
				try {
					log("value : " + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}		
	}

}
