package classAndobjects;

public class Demo1 {
	int x = 10;// instance variable
	String name = "chai";
	static int y = 50;// static variable

	public static void main(String[] args) {
		System.out.println(Demo1.y);
		Demo1 d = new Demo1();// creating a object
		System.out.println(d.x);
		System.out.println(d.name);
	}
}
