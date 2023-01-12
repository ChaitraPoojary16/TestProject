package core_java;

import java.util.Scanner;

public class InsertArray {
	public static void main(String[] args) {
		int arr[] = new int[10];

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = scn.nextInt();
		System.out.println("Enter " + n + "array element");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Content of the array");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println("Enter the position where you want to insert a new elemnt");
		int position = scn.nextInt();
		System.out.println("Enter the value:");
		int value = scn.nextInt();
		for (int i = n-1; i >=position-1; i--) {
			arr[i + 1] = arr[i];

		}
		arr[position - 1] = value;
		System.out.println("Arrya after insertion of the new element");
		for (int i = 0; i <= n; i++) {
			System.out.println(arr[i] + "");
		}
	}
}
