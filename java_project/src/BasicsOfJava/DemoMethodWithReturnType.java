package BasicsOfJava;

public class DemoMethodWithReturnType {

	public static void main(String[] args) {
		System.out.println("inside the main method");
		int val = divideTwoNumbers(100, 10);
		System.out.println("val = " + val);
		String name = printMyName();
		System.out.println("name = " + name);
	}

	static String printMyName() {
		System.out.println("inside method printMyName");
		String s1 = "rakesh";
		return s1;
	}

	static int divideTwoNumbers(int i, int j) {
		System.out.println("inside the divideTwoNumbers method");
		int quotient = i / j;
		return quotient;
	}

}
