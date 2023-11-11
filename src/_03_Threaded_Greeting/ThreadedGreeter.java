package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {

	private int num;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Thread greeting number #" + num);
		
		if(num <= 50) {
			ThreadedGreeter newThread = new ThreadedGreeter(num+1);
			newThread.run();
		}
	}
	
	public ThreadedGreeter(int num) {
		this.num=num;
	}

}
