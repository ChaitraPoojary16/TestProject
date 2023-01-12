package objectClassDemo;

public class StringDemo {
	public static void main(String[] args)
	{
		String s1 = new String("rakesh");
		String s2 = new String("rakesh");
		if(s1.equals(s2))//content is compared in s1 and s2
		{
		System.out.println("yes s1 and s2 are equal");
		}
		else {
			System.out.println("yes s1 and s2 are NOT equal");
		}
		
	}
}
