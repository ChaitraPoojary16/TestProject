package hasARelation1;

public class Sample {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		System.out.println(t2.x);
		t2.check();
		System.out.println(t2.t1.m);
		t2.t1.view();
	}
}