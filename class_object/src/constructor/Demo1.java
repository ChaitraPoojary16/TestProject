package constructor;

public class Demo1 {
	//no- argument constructor
	Demo1() {
		System.out.println("inside constructor");
	}

	public static void main(String[] args) {
		System.out.println("inside main method");
		Demo1 d = new Demo1();
		System.out.println("Inside main method");
	}
}
