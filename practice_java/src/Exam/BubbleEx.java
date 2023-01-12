package Exam;

import java.util.Scanner;

public class BubbleEx {
	public static void main(String[] args) {

		int arr[] = new int[5];
		System.out.println("Enter array elements");
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < 5; i++)
			arr[i] = scn.nextInt();
		for (int i = 0; i < 5; i++)
			for (int j = i+1; j < 5; j++)
				if (arr[i] < arr[j]) {
					int a;
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
		System.out.println("Array sort");
		for(int i=0;i<5;i++) {
			System.out.print(" " +arr[i]);
		}

	}
}
