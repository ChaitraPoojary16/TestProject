package threadsDemo;

public class DemoRunnable implements Runnable{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("inside thread class "+
		Thread.currentThread().getName());
		}
	}
}
