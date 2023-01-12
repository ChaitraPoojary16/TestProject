package staticBlocksDemo;

public class Demo1 {

	static
	{
		System.out.println("inside static block1");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
	}
}
