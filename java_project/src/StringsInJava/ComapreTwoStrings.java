package StringsInJava;

public class ComapreTwoStrings {
	public static void main(String[] args) 
	{
		String s1 = "Selenium";
		String s2 = "selenium";
		boolean result1 = s1.equals(s2);
		System.out.println("result1 = "+result1);
		
		boolean result2 = s1.equalsIgnoreCase(s2);
		System.out.println("result2 = "+result2);
		
		boolean result3 = s1.contains("nium");
		System.out.println("result3 = "+result3);
		
		String s3 = "java";
		String s4 = "java";
		boolean result4 = s3 == s4;
		System.out.println("result4 = "+result4);
		
		String s5 = new String("programming");
	//	s5 = "programming";
		String s6 = new String("programming");
	//	s6 = "programming";
		boolean result5 = (s5 == s6);
		System.out.println("result5 = "+result5);
	
		//  == operator checks if the references to string objects are equal or not
		//  .equals() checks if the contents of both objects are same
	}
}
