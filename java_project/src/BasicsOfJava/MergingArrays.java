package BasicsOfJava;

import java.util.Scanner;

public class MergingArrays {

	public static void main(String[] args) 
	{
		Scanner ref = new Scanner(System.in);
//first array
		System.out.println("Please enter the size of first array");
		int size1  = ref.nextInt();// take the size from user

		int[] ary1 = new int[size1];// create the array

		for(int i=0; i<size1; i++)// read the values from user into the array
		{
			System.out.println("enter the value for index "+i);
			ary1[i] = ref.nextInt();
		}
		//print the array
		System.out.println("the contents of the array ary1 is \n");
		for(int i=0; i<ary1.length;i++)
		{
			System.out.println(ary1[i]);
		}
//second array
		System.out.println("Please enter the size of second array");
		int size2  = ref.nextInt();// take the size from user

		int[] ary2 = new int[size2];// create the array

		for(int i=0; i<size2; i++)// read the values from user into the array
		{
			System.out.println("enter the value for index "+i);
			ary2[i] = ref.nextInt();
		}
		//print the array
		System.out.println("the contents of the array ary2 is \n");
		for(int i=0; i<ary2.length;i++)
		{
			System.out.println(ary2[i]);
		}

// merge two arrays
		int[] ary3 = new int[size1 + size2];
		for(int m=0; m<ary3.length; m++)
		{
			if(m<ary1.length)
			{
				ary3[m] = ary1[m];
			}
			else
			{
				ary3[m] = ary2[m-ary1.length];
			}	
		}
		//print the array
		System.out.println("the contents of the merged array ary3 is \n");
		for(int i=0; i<ary3.length;i++)
		{
			System.out.println(ary3[i]);
		}
	}


}
