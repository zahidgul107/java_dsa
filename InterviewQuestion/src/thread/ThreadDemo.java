package thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		
		thread1.start();
		
		MyRunnable runnable = new MyRunnable();
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
	}

}
