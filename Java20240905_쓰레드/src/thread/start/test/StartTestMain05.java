package thread.start.test;

import static util.MyLogger.log;

public class StartTestMain05 {
	public static void main(String[] args) {
				
		Thread thread1 = new Thread(new PrintThread("A", 1000), "Thread-A");		
		Thread thread2 = new Thread(new PrintThread("B", 500), "Thread-B");
		
		thread1.start();
		thread2.start();	
		
	}
	
	// StartTestMain04 반복된 Runnable 객체를 구현 클래스로 생성
	static class PrintThread implements Runnable {
		private String alphabet;
		private int delay;		
		
		public PrintThread(String alphabet, int delay) {
			this.alphabet = alphabet;
			this.delay = delay;
		}

		@Override
		public void run() {
			while(true) {
				try {
					log(alphabet);
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
