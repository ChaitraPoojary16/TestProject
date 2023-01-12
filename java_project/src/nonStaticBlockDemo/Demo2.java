package nonStaticBlockDemo;

public class Demo2 {

	{
		System.out.println("inside non- static block1");
	}
	{
		System.out.println("inside non- static block3");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		Demo2 d2 = new Demo2();
	}
	
	{
		System.out.println("inside non- static block2");
	}
}
