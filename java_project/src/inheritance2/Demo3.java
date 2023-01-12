package inheritance2;

public class Demo3 extends Demo2{

	Demo3(String name, int age)
	{
		super(20);
		System.out.println("inside demo3 constr");
		System.out.println(name+" = "+age);
	}
}
