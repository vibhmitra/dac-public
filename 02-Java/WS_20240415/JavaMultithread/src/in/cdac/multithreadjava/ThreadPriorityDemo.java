package in.cdac.multithreadjava;

class MyThreadP1 extends Thread { 
	
	public void run() {	
		System.out.println("MyThreadP1 Name : " + Thread.currentThread().getName()); 
	}
}

class MyThreadP2 extends Thread {
	public void run() {	
		System.out.println("MyThreadP2 Name : " + Thread.currentThread().getName()); 
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		MyThreadP1 t1 = new MyThreadP1();
		MyThreadP2 t2 = new MyThreadP2();
		t2.setPriority(Thread.MAX_PRIORITY);			// BUT THIS IS DEPEND UPON THE JVM
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
