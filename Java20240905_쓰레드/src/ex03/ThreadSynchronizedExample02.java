package ex03;

class Counter {
	private int count;
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	int getCount() {
		return count;
	}
}

public class ThreadSynchronizedExample02 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		Runnable task1 = () -> {
			for(int i=0; i<=1000; i++) {
				counter.increment();
			}
		};
		
		Runnable task2 = () -> {
			for(int i=0; i<=1000; i++) {
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
