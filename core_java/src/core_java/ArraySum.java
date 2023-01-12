package core_java;

import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {
	int arr[]=new int[5];
	int sum=0;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the elemnts(5) of the array");
	for(int i=0;i<5;i++) {
		arr[i]=scn.nextInt();
		sum=sum+arr[i];
	}
	System.out.println("The sum of all elemnts of the array: "+sum);
}
}
