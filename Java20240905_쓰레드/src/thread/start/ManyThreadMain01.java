package thread.start;

import static util.MyLogger.*;

public class ManyThreadMain01 {

	public static void main(String[] args) {
		log("main() start");
		
		HelloRunnable runnable = new HelloRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Thread t2 = new Thread(runnable);
		t2.start();
		
		Thread t3 = new Thread(runnable);
		t3.start();
		
		log("main() end");
		
	}

}
