package core_java;

import java.util.Scanner;

public class Count108 {
	public static void main(String[] args) {
		int arr[] = { 11, 11, 11, 44, 22, 11, 22, 88, 99, 11 };
		int n;
		int count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number you want to search-");
		n = scn.nextInt();
		for (int i = 0; i < 10; i++) {
			if (n == arr[i]) {
				count++;
		}
	}
	System.out.println("content of the array");
	for(int i=0;i<10;i++) {
		System.out.println(arr[i]+"");	
	}
	System.out.println("Number of occurance int the array "+count);
	}
}
