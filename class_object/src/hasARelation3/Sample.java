package hasARelation3;
public class Sample {
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		Demo2 d2=new Demo2(obj);
		System.out.println(d2.x);
		d2.check();
		System.out.println(d2.d.m);
		d2.d.view();
	}
}
