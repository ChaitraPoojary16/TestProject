package StringsInJava;

public class JoinTwoStrings {
	public static void main(String[] args) 
	{
		String firstString = "Java";
		String secondString = "Selenium";
		String joinedString = firstString + secondString;
		System.out.println("joinedString = "+joinedString);
		
		String s1 = "Hello";
		String s2 = "World!";
		String s3 = s1.concat(s2);
		System.out.println("concated String = "+s3);
		
		String s4 = s2.concat(s1);
		System.out.println("concated String = "+s4);
		
		String s5 = "pratap";
		System.out.println(s5.replace('p', 's'));
		
		
	}
}
