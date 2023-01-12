package core_java;

import java.util.Scanner;

public class DuplicateEle {
public static void main(String[] args) {
	int arr[]=new int[50];
	int n;
	int i ,j,k;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter array size");
	n=scn.nextInt();
	System.out.println("Enter "+n+" array elemnts:");
	for( i=0;i<n;i++) {
		arr[i]=scn.nextInt();
		
	}
	System.out.println("Content of the array");
	for( i=0;i<n;i++) {
		System.out.println(arr[i]+"");
		
	}
	for( i=0;i<n;i++) {
		for(j=i+1;j<n;) {
			if(arr[i]==arr[j]) {
				for(k=j;k<n;k++) {
					arr[k]=arr[k+1];
				}
				n--;
			}
			else
			{
				j++;
			}
		}
	}
	System.out.println("Content of the array after duplicte removL");
	for( i=0;i<n;i++) {
		System.out.println(arr[i]+"");
	}
}
}
