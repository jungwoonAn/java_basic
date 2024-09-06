package thread.start;

import static util.MyLogger.*;

public class InnerRunnableMain01 {

	public static void main(String[] args) {
		log("main() start");
		
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		
		log("main() start");
	}
	
	// 정적 중첩 클래스 사용
	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			log("run()");
		}		
	}

}
