package StringsInJava;

public class CharOccurenceCount {
	public static void main(String[] args) 
	{
		String s1 = "alpha beta gamma";
		char searchString = 'a';
		int count = 0;
		
		for(int i=0; i<s1.length(); i++)
		{
			if(searchString == s1.charAt(i))
			{
				count++;
			}
		}
		System.out.println(s1);
		System.out.println("count of a occurence = "+count);
	}
}
