package hasARelationpckg4;

public class Sample 
{
	public static void main(String[] args) {
		Demo1 d1 =  new Demo1();
		Demo2 d2 = new Demo2(d1);
		d2.obj1.view();
		System.out.println("vlaue of p = "+d2.obj1.p);
		
		d2.printName();
		System.out.println("vlaue of q = "+d2.q);
	}
}
