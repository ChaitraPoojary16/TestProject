package core_java;

import java.util.Scanner;

public class ScannerClass1 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the size");
	int size= scn.nextInt();
	int[] nary=new int[size];
	System.out.println("Enter elemnets to array");
	for(int i=0;i<size;i++)
	{
		nary[i]=scn.nextInt();
		
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(nary[i]);
	}
	int size1=scn.nextInt();
	int[] ary=new int[size1];
	System.out.println("Enter the second size");
	for(int j=0;j<size1;j++)
	{
		ary[j]=scn.nextInt();
		
	}
	for(int j = 0;j<size1;j++)
	{
		System.out.println(ary[j]);
		
	}
}
}
