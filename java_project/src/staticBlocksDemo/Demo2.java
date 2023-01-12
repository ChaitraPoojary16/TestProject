package staticBlocksDemo;

public class Demo2 {
	static int x;
	static
	{
		System.out.println("inside static block1");
		x =90;
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		System.out.println("the value of x = "+x);
	}
}
