package StringsInJava;

public class ReverseWordsInString {
	public static void main(String[] args)
	{
		String s1 = "Classes and objects are Java concepts";
		ReverseWordsInString obj1 = new ReverseWordsInString();
		obj1.reverseStringMethod1(s1);
		System.out.println("");
		obj1.reverseStringMethod2(s1);
	}
	
	void reverseStringMethod1(String s1)
	{
		String s2 = "";
		String[] strAry = s1.split(" ");
		for(int i=0; i<strAry.length; i++)
		{
			char[] c = strAry[i].toCharArray();
			for(int j=c.length-1; j>=0; j--)
			{
				s2 = s2+c[j];
			}
		}
		System.out.println("s2 = "+s2);	
	}
	
	void reverseStringMethod2(String s1)
	{
		String s2 = "";
		String[] strAry = s1.split(" ");
		
		for(int i=0; i<strAry.length; i++)
		{
			String temp = strAry[i];
			char[] cary = new char[temp.length()] ;
			for(int j=0; j<cary.length; j++)
			{
				cary[j] = temp.charAt(j);
			}
			for(int k=0; k<cary.length; k++)
			{
				s2 = cary[k] + s2;	
			}
		}
		System.out.println("s2 = "+s2);	
	}
}
