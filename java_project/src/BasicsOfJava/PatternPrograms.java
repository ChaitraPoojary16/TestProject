package BasicsOfJava;

public class PatternPrograms {

	public static void main(String[] args) {
		int n=5;
		System.out.println("pattern 1");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("pattern 2");
		for(int i=0;i<n;i++)
		{		
			for(int j=0; j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("pattern 3");
		for(int i=0;i<n;i++)
		{		
			for(int j=0; j<n;j++)
			{
				if(i+j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
}
