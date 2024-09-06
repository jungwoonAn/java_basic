package thread.start;

import static util.MyLogger.*;

public class InnerRunnableMain02 {

	public static void main(String[] args) {
		log("main() start");
		
		// 익명 클래스 사용
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				log("run()");
			}		
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		log("main() start");
	}
}
