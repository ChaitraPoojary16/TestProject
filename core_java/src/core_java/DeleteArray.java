package core_java;

import java.util.Scanner;

public class DeleteArray {
public static void main(String[] args) {
	int arr[]=new int[50];
	int n;
	int position=0;
	int elements;
	boolean found =false;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter number of elements in array");
	n=scn.nextInt();
	System.out.println("Enter"+n+"elements");
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
		}
	System.out.println("Content of the array");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]+"");
		
	}
	System.out.println("Enter the element to be deleted");
	elements=scn.nextInt();
	for(int i=0;i<n;i++) {
		if(arr[i]==elements) {
			found=true;
			position=i;
			break;
		}
	}
	if(found) {
		for(int i=position ;i<n-1;i++) {
			arr[i]=arr[i+1];
			
		}
	}else
	{
		System.out.println("Element"+elements+"is not found  in the array");
		
	}
	System.out.println("Array after deletion of the element");
	for(int i=0;i<n-1;i++) {
		System.out.println(arr[i]+"");
	}
}
}
