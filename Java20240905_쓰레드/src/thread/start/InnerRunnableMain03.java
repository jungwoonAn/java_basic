package thread.start;

import static util.MyLogger.*;

public class InnerRunnableMain03 {

	public static void main(String[] args) {
		log("main() start");
		
		// 익명 클래스 변수없이 직접 전달		
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				log("run()");
			}		
		});
		
		thread.start();
		
		log("main() start");
	}
}
