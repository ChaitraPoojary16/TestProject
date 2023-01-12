package core_java;

public class LogicalOperators
{
	public static void main(String[] args)
	{
		int a=10, b=5;
		 boolean res=a>b &a<b;
		System.out.println(res);
			
		boolean res1=a>b | a<b;
		System.out.println(res1);
		
		boolean res2=a>b&&a<b;
		System.out.println(res2);
		
		boolean res3=a>b || a<b;
		System.out.println(res3);
	}
	
}
