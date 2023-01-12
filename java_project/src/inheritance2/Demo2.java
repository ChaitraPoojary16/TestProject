package inheritance2;

public class Demo2 extends Demo1{
	Demo2(int num)
	{
		super('z',9.07);
		System.out.println("inside demo2 constr");
		System.out.println(num);

	}
}
