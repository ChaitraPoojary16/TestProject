package core_java;

public class LogicalOP
{
	public static void main(String[] args)
	{
		int a=10, b=20, c=5;
		
		boolean x=a<b &&(c=a+b)>b;
		System.out.println(c);
		System.out.println(x);
		
		boolean y=a>b ||(c=a+b)>b;
		System.out.println(c);
		System.out.println(y);
		
		
	}
	
}
