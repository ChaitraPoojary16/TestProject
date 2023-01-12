package classTypeCcasting;

public class Sample {
	public static void main(String[] args) {

		// class type casting
		// 1 Implicit class type casting
		// 2 explicit class type casting
		byte a = 10;
		int x = (int) a;
		// upcasting is converting subclass to super class type

		Demo1 d1 = new Demo2();// sub class properties are masked
		d1.view();
		d1.display();

		Demo1 obj = (Demo1) new Demo2();
		obj.display();
		obj.view();

		/*
		 * Demo1 obj = new Demo2();//implicit upcasting subclass to super class
		 * obj.display(); obj.view(); Demo1 ref = (Demo1)new Demo2();//explicit
		 * upcasting subclass to super class
		 */

	}
}
