package BasicsOfJava;

public class DemoMethod1 {

	//no arguments method
	static void printSomething ()
	{
		System.out.println("Inside No Arguments method");
	}

	public static void main(String[] args)
	{
		System.out.println("Inside main method check 1");
		printSomething();//method calling
		DemoMethod1.printSomething();
		System.out.println("inside main method check 2");
	}
}
