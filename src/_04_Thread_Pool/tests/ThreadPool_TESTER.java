package _04_Thread_Pool.tests;

public class ThreadPool_TESTER {
	public static void main(String[] args) {
		WorkQueue wq = new WorkQueue();
		System.out.println(wq.getThreadCount());
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		wq.shutdown();
	}
}
