package thread.start.test;

import static util.MyLogger.*;

public class StartTestMain01 {

	public static void main(String[] args) {
		
		CounterThread counter = new CounterThread();
		counter.start();
		
	}
	
	static class CounterThread extends Thread {
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
