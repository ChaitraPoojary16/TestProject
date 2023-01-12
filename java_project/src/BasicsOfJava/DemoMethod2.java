package BasicsOfJava;

public class DemoMethod2 {

	public static void main(String[] args) {
		System.out.println("Inside main method check 1");
		addTwoNumbers(10, 20);//call argumented method
		System.out.println("Inside main method check 2");
		DemoMethod2.addTwoNumbers(99,20);
	}

	//argumented methods
	static void addTwoNumbers(int i, int j) {
		System.out.println("Inside argumented method");
		int Sum = i + j;
		System.out.println("The sum is "+ Sum);	
	}
	static void multiplyTwoNumbers(int i, int j) {
		System.out.println("Inside argumented method");
		int val = i * j;
		System.out.println("The sum is "+ val);	
	}
}
