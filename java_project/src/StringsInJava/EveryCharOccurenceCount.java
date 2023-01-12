package StringsInJava;

public class EveryCharOccurenceCount {
	public static void main(String[] args)
	{

		String s1 = "alpha beta gamma";
		String s2 = s1.replace(" ", "");
		System.out.println(s2);
		
		for(int i=0; i<s2.length(); i++)
		{
			char searchString = s2.charAt(i);
			countOccurenceChar(s2, searchString);
		}
	}

	static void countOccurenceChar(String s2, char searchString)
	{
		int count = 0;
		for(int i=0; i<s2.length(); i++)
		{
			if(searchString == s2.charAt(i))
			{
				count++;
			}
		}
		System.out.println("'"+searchString+"' count is "+count);
	}
}

