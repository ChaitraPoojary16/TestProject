package core_java;

public class Frequency 
{
public static void main(String[] args) 
{
	int []arr= {40,30,10,10,20,20,20,30,10};
	int [] frr=new int [arr.length];
	int a = -1;
      for(int i=0;i<arr.length;i++) 
	{
		int count=1;
		for(int j=i+1;j<arr.length;j++) 
		{
			if(arr[i]==arr[j]) 
			{
				count++;
				frr[j]=a;
			}
		}
		if(frr[i]!= a) 
			frr[i] = count;
    }

		for(int i=0;i<frr.length;i++) 
		{
			if(frr[i]!=a) 
			
				System.out.println(" "+arr[i]+"="+frr[i]);
			
		}
	}
}
