package StringsInJava;

public class ReverseAstringMethod2 {
	
	public static void main(String[] args) {
		String s1 = "Hello welcome to java";
		ReverseAstringMethod2 obj = new ReverseAstringMethod2();
		obj.reverseStringMethod1(s1);
		obj.reverseStringMethod2(s1);
	}
	
	void reverseStringMethod1(String s)
	{
		String new_s1 = "";
		char c;
		for(int i=0; i<s.length(); i++)
		{
			c = s.charAt(i);
			new_s1 = c + new_s1;
		}		
		System.out.println("new string s2 = "+new_s1);
	}
	void reverseStringMethod2(String s)
	{
		String new_s1 = "";
		char c;
		for(int i=s.length()-1; i>=0; i--)
		{
			c = s.charAt(i);
			new_s1 = new_s1 + c;
		}
		System.out.println("new string s2 = "+new_s1);
	}

}
