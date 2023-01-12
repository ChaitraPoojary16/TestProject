package core_java;

import java.util.Scanner;

public class MinMax {
public static void main(String[] args) {
	int arr[]=new int [10];
	int i;
	int min, max;
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter the elements of the array");
	for(i=0;i<10;i++) {
		arr[i]=scn.nextInt();
		
	}
	max=arr[0];
	min=arr[0];
	for(i=1;i<10;i++) {
		if(max<arr[i] ){
			max=arr[i];
			
		}
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("The largest elemnts of the array: "+max);
	System.out.println("The smallest elemnets of the array: "+min);
}
}
