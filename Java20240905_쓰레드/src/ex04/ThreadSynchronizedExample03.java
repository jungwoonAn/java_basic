package ex04;

class Counter {
	private int count;
	
	// 동기화 메서드 선언
	public synchronized void increment() {
		count++;
	}
	
	// 동기화 메서드 선언
	public synchronized void decrement() {
		count--;
	}
	
	int getCount() {
		return count;
	}
}

public class ThreadSynchronizedExample03 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		Runnable task1 = () -> {
			for(int i=0; i<=1000; i++) {
				counter.increment();
			}
		};
		
		Runnable task2 = () -> {
			for(int i=0; i<1000; i++) {
				counter.decrement();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();  // 다른 쓰레드 종료 기다림
		t2.join();

		System.out.println("counter : " + counter.getCount());
			
	}

}
