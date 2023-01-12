package threadsDemo;

public class MainThread {
	public static void main(String[] args) {
		Demothread d1 = new Demothread();
		d1.setName("thread 1");
		Demothread d2 = new Demothread();
		d2.setName("thread 2");
		
		d1.start();
		d2.start();
		
	}
}