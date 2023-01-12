package hasARelationpckg3;

public class Sample {

	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2();
		d2.d1.view();
		System.out.println("value of i = "+d2.d1.i);
		
		d2.printName();
		System.out.println("the value of k ="+d2.k);
	}

}
