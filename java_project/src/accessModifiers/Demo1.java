package accessModifiers;

public class Demo1 
{	
	protected int y =20;
	
	protected void view(String name)
	{
		System.out.println("Inside printName method of Demo1 class");
	}
}






//default modifiers can be accessed within pckg and NOT outside pckg
//public modifiers can be accessed within pckg and outside pckg
//private modifiers can be accessed only within the class
//protected modifiers can be accessed within pckg and NOT outside pckg(except subclass in diff packg)
