package nonStaticBlockDemo;

public class Demo1 {

	{
		System.out.println("inside non- static block1");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		Demo1 d1 = new Demo1();
	}
}
