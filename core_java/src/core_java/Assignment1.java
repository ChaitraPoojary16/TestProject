package core_java;

public class Assignment1 
{
	public static void main(String[] args)
	{
		int x=1, y=1;
		int res=x++ + ++x + x + x++;
		int res1=y++ - --y + y++ +y;
		System.out.println("The value of res " +res);
		System.out.println("The value of res1 " +res1);
		
	}

}
