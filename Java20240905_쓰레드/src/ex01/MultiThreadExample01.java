package ex01;

public class MultiThreadExample01 {
	
	public static void main(String[] args) {
		
		Runnable task1 = new Runnable() {			
			@Override
			public void run() {
				try {
					for(int i=0; i<=20; i++) {
						if(i%2 == 0)  // 짝수 출력
							System.out.print(i + " ");				
//						Thread.sleep(1000);  // 1초 동안 일시정지
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
				
		// 람다식으로
		Runnable task2 = () -> {
			try {
				for(int i=0; i<=20; i++) {
					if(i%2 == 1)  // 홀수 출력
						System.out.print(i + " ");				
					Thread.sleep(1000);  // 1초 동안 일시정지
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		
		// 쓰레드 객체 생성
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		// 쓰레드 실행 -> 순서를 보장 못함
		thread1.start();
		thread2.start();
	}
}
