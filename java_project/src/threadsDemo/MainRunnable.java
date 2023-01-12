package threadsDemo;

public class MainRunnable {
	public static void main(String[] args) {
		DemoRunnable d1 = new DemoRunnable();
		Thread t1 = new Thread(d1);
		t1.start();
		

		DemoRunnable d2 = new DemoRunnable();
		Thread t2 = new Thread(d2);
		t2.start();
	}
}