package BasicsOfJava;

import java.util.Scanner;

public class ArraySizeScanner {
	public static void main(String[] args) 
	{
		Scanner ref = new Scanner(System.in);
		System.out.println("Please enter the size");
		int size  = ref.nextInt();// take the size from user

		int[] chir = new int[size];// create the array
		
		for(int i=0; i<size; i++)// read the values from user into the array
		{
			System.out.println("enter the value for index "+i);
			chir[i] = ref.nextInt();
		}
		//print the array
		System.out.println("the contents of the array");
		for(int i=0; i<chir.length;i++)
		{
			System.out.println(chir[i]);
		}
	}
}
