package in.cdac.multithreadjava;

class MyThread extends Thread {
//	public void start()									// overriding start() NOW the run() method will not be called
//	{	super.start();									// if override start() use super()
//		System.out.println("start()");
//	}
	
	@Override
	public void run() {									// In main we are not even calling this yet it is getting invoked.
		
		System.out.println("run() w/o argument.");	
	}
	
	public void run(int x) {							// Parameterized run() will NOT be invoked tho
		System.out.println("run() w/ arg " + x);
	}
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
			
	}
	
}

public class MainThread1{

	public static void main(String[] args) {
		Thread to1 = Thread.currentThread();
		System.out.println("Current Thread : " + to1);
		System.out.println("Thread Name : " + to1.getName());
		
		to1.setPriority(10);
		
		MyThread mth1 = new MyThread();
		mth1.start();		// creates new thread + invokes run()
		
		System.out.println("Main() ends here.");
//		mth.start();		// Illegal Thread Exception
		
		MyThread2 mth2 = new MyThread2();
		
		
		Thread to2 = new Thread(mth2);
		
		to2.start();			// this will give unpredictable o/p
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
