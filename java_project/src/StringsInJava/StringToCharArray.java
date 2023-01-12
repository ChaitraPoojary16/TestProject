package StringsInJava;

public class StringToCharArray {

	public static void main(String[] args) {

		//method1 of String --> char[] 
		String s1 = "My name is Rakesh this is my automation code";
		char[] copy_s1 = new char[s1.length()];
		for(int i=0; i<s1.length(); i++)
		{
			copy_s1[i] = s1.charAt(i);
		}
		//print the char array
		for(int i=0; i<copy_s1.length; i++)
		{
			System.out.print(copy_s1[i]);
		}
		
		System.out.println("");
		//method2 of String --> char[] 
		String s2 = "selenium is for automation";
		char[] copy_s2 = s2.toCharArray();
		//print the char array
		for(int i=0; i<copy_s2.length; i++)
		{
			System.out.print(copy_s2[i]);
		}


	}
}
