package StringsInJava;

public class MethodsInString {
	public static void main(String[] args) 
	{
		String s1 = "World is a better place";
		
		String s2 = s1.substring(6, 10);
		String s3 = s1.substring(10);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s3.trim());
		
		String s4 = s1.replace("a", "@");
		System.out.println(s4);
		
		String s5 = s1.toLowerCase();
		System.out.println(s5);
		
		String s6 = s1.toUpperCase();
		System.out.println(s6);
		
		String s7 = "";
		System.out.println(s7.isEmpty());
	}
}
