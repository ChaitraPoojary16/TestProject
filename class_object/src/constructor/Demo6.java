package constructor;

public class Demo6 {
	Demo6() {
		System.out.println("Inside Demo6");
	}

	Demo6(int x) {
		
		System.out.println("inside Interger argument");
		System.out.println(x);
	}

	Demo6(String name) {
		System.out.println("Inside String arguments");
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		Demo6 d = new Demo6();
		Demo6 d1 = new Demo6(123);
		Demo6 d2 = new Demo6("Chai");
		
	}
}
