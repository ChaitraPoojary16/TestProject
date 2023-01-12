package core_java;

import java.util.Arrays;
import java.util.Scanner;

public class CountNum {
	public static void main(String[] args) {

		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=scn.nextInt();
		int arr[]=new int[50];
		int occur[]=new int[n];
		Arrays.fill(occur, 0);
		System.out.println("Enter array elemnts ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			occur[arr[i]]++;
		}
		for(int i=0;i<n;i++) {
			if(occur[i]>1) {
				System.out.println(i +"is occur[i]"+"times");
			}
		}
	}
}