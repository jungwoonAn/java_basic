package util;

import static util.MyLogger.log;

public class ThreadUtils {
	public static void sleep(long millins) {
		try {
			Thread.sleep(millins);
		} catch (InterruptedException e) {
			log("인터럽트 발생, " + e.getMessage());
			e.printStackTrace();
		}
	}

}
