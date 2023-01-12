package thread;

public class MainThread {
public static void main(String[] args) {
	DemoThread d=new DemoThread();
	Thread t=new Thread(d);
	t.start();
	
	DemoThread d1=new DemoThread();
	Thread t1=new Thread(d1);
	t1.start();
}
}
