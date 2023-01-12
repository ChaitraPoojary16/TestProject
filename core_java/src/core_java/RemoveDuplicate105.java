package core_java;

import java.util.Scanner;

public class RemoveDuplicate105 {
public static void main(String[] args) {
	int arr[]=new int[50];
	int arr1[]=new int[50];
	int n,i,j;
	int count=0;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter array size");
	n=scn.nextInt();
	System.out.println("Enter "+n+"array element");
	for(i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	System.out.println("Content of the array");
	for(i=0;i<n;i++) {
		System.out.println(arr[i]+"");
		
	}
	for(i=0;i<n;i++) {
		for(j=0;j<count;j++) {
			if(arr[i]==arr1[j])
				break;
		}
		if(j==count) {
			arr1[count]=arr[i];
			count++;
			
		}
	}
	System.out.println("Content of the array after duplicate removal");
	for(i=0;i<count;i++) {
		System.out.println(arr1[i]+"");
	}
}
}

