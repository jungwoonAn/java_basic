package thread.start;

import static util.MyLogger.*;

public class InnerRunnableMain04 {

	public static void main(String[] args) {
		log("main() start");
		
		// 람다식	
		Thread thread = new Thread(() -> {
				log("run()");				
		});
		
		thread.start();
		
		log("main() start");
	}
}
