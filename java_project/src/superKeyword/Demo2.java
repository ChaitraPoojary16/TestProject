package superKeyword;

public class Demo2 extends Demo1{
	int i = 90;
	void print()
	{	
		System.out.println("inside print method");
		System.out.println("super class i value is = "+super.i);
		System.out.println("sub class i value is = "+this.i);
	}

}
