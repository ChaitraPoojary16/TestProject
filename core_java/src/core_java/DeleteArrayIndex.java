package core_java;

import java.util.Scanner;

public class DeleteArrayIndex {
	public static void main(String[] args) {
		int arr[] = new int[50];
		int n;
		int position;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		n = scn.nextInt();
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Content of the array");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");

		}
		System.out.println("Enter the position where u want to delete the element");
		position = scn.nextInt();
		if (position >= n + 1) {
			System.out.println("Deletion Error:Invalid Position");
		} else {
			for (int i = position - 1; i < n - 1; i++) {
				arr[i] = arr[i + 1];

			}
		}
		System.out.println("Array after deletion of the elemnt");
		for (int i = 0; i < n - 1; i++) {
			System.out.println(arr[i] + "");
		}
	}
}
