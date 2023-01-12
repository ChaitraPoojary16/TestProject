package hasARelationpckg2;

public class Sample 
{
	public static void main(String[] args)
	{
		System.out.println("inside main method of class3 Sample");
		Demo1 d1 = new Demo1();
		d1.view();
		System.out.println(d1.x);
		
		Demo2 d2 = new Demo2();
		d2.printName();
		System.out.println(d2.y);
		
	}
}
