package examples.thread.java;

public class CurrentThreadWait {
	public static void main(String[] args) throws Exception {
		Object o = new Object();

		synchronized (Thread.currentThread()) {
			o.wait();
			o.notify();
		}
	}
}
