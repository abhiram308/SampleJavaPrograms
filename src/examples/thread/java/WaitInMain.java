package examples.thread.java;

public class WaitInMain {
	public static void main(String[] args) {
		System.out.println("A ");
		synchronized (args) {
			System.out.println("B ");
			try {
				args.wait();
			} catch (Exception e) {
				
			}
		}
		System.out.println("C ");
	}
}
