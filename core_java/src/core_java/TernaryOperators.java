package core_java;

public class TernaryOperators
{
	public static void main(String[] args)
	{
		int a=-1;
		String res=a>0? "a is positive" : "a is negative";
		System.out.println(res);
		
		int b=10, c=20;
		int bignum=(b>c)?b:c;
		System.out.println("bigger Number is "+bignum);
		
	}
}
