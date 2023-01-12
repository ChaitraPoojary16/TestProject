package core_java;

import java.util.Scanner;

public class ReverseArray 
{
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int[] arr=new int[5];
	
	System.out.println("Enter the array elements:");
	for(int i=0;i<5;i++) {
		arr[i]=scn.nextInt();
	}
	System.out.println("Array elemnts are: ");
	for(int i=0;i<5;i++) {
		System.out.print(" " +arr[i]);
	}
	System.out.println("Reverse order:");
	for(int i=4;i>=0;i--) {
		System.out.print(" " +arr[i]);
	}
}
}
