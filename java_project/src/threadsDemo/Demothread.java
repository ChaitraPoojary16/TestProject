package threadsDemo;

public class Demothread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("inside thread class "
		+ Thread.currentThread().getName());
		}
	}
}
