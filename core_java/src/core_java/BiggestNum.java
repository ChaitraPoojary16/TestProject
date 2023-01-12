package core_java;

public class BiggestNum 
{
	public static void main(String[] args) {
		int [] num= new int[] {10,50,20,80,20};
		int max=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			max=num[i];
			
		}
		System.out.println("Largest element in the array "+max);
		
		
	}
}
