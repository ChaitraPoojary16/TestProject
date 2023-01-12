package objectClassDemo;

public class MainEquals {
public static void main(String[] args)
{
	DemoEquals obj1 = new DemoEquals(34, "chiru");
	DemoEquals obj2 = new DemoEquals(24, "rakesh");
		
	if(obj1.equals(obj2))
	{
	System.out.println("yes objects are equal");
	}
	else
	{
		System.out.println("yes objects are NOT equal");
	}
}
}
