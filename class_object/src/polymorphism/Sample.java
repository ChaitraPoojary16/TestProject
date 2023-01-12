package polymorphism;

public class Sample {
	public static void main(String[] args) {
		Test1 t1 = new Test2();
		t1.insert();
		t1.delete();
	}
}