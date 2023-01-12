package Encapsulation;

import java.util.Scanner;

public class DemoMain {
	public static void main()
	{
		Scanner scn= new Scanner(System.in);
		Sysout("enter the size");
		int size = scn.nextInt();
		//input to array
		int[] ary = new int[size];
		for(int i=0;i<size;i++)
		{
			Sysout("entr the values");
			ary[i] = scn.nextInt();			
		}
		//printing the array
		Sysout("the values in the array are");
		for(int i=0;i<size;i++)
		{
		Sysout(ary[i]);			
		}
		
		//second array
		Sysout("enter the size");
		int size2 = scn.nextInt();
		//input to array
		int[] ary2 = new int[size2];
		for(int i=0;i<size;i++)
		{
			Sysout("entr the values");
			ary2[i] = scn.nextInt();			
		}
		//printing the array
		Sysout("the values in the array are");
		for(int i=0;i<size2;i++)
		{
		Sysout(ary2[i]);			
		}
		
		
		//third array
		int[] ary3 = new int[size+size2];
		
		for(int i=0;i<ary3.length;i++)
		{
			if(i<size)
			{
				ary3[i] = ary1[i];
			}else{
				ary3[i] = ary1[i-size];
			}
		}
	}

	private static void Sysout(String string) {
		// TODO Auto-generated method stub
		
	}
}
