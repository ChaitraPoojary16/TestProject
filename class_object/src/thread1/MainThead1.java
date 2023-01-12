package thread1;

public class MainThead1 {
public static void main(String[] args) {
	DemoThread1 d1=new DemoThread1();
	Thread t1=new Thread(d1);
	t1.start();
	
	DemoThread1 d2=new DemoThread1();
	Thread t2=new Thread(d2);
	t2.start();
}
}
