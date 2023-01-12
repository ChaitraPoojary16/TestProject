package BasicsOfJava;

public class DemoMethod3 {

	public static void main(String[] args) {
		int a=20, b= 30;
		System.out.println("inside main method");
		multiplyTwoNumbers(a, b);//parameterized method call
		
	}

	static void multiplyTwoNumbers(int a, int b) {
		System.out.println("inside method multiply TwoNumbers");
		int firsNum = a;
		int secNum = b;
		int value = firsNum * secNum;
		System.out.println("The value is "+value);	
	}
}
