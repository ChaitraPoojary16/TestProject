package staticBlocksDemo;

public class Demo3 {
	static {
		System.out.println("inside static block1");
	}
	static {
		System.out.println("inside static block2");
	}

	public static void main(String[] args) {
		System.out.println("inside main method");
	}

	static {
		System.out.println("inside static block3");
	}
}
