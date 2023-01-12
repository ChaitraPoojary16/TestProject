package ConstructorsInJava;

public class ChainingConst {

	ChainingConst()
	{
		this(21);
		System.out.println("inside 1st constructor");
	}
	ChainingConst(int age)
	{
		this(34, 'a');
		System.out.println("inside 2nd constructor");
	}
	ChainingConst(int age, char c)
	{
		System.out.println("inside 3rd constructor");
	}
	public static void main(String[] args) 
	{
		ChainingConst obj = new ChainingConst();
	}
}
