package upcasting;

public class Main {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test1 a =  t2;
		// Test1 b =new Test2();
		// Test1 c=(Test1)t2;
		a.delete();
		a.insert();
	}
}
