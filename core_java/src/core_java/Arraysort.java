package core_java;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		int arr[] = { 10, 10, 10, 30, 20, 20, 50, 40, 30 };
		Arrays.sort(arr);
		System.out.println("Sorted array- ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
		System.out.println("*******");
		int count = 1;
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
			else {
				System.out.println(arr[i] + "=" + count);
				count = 1;
				//
			}
			
		}
		System.out.println(arr[arr.length - 1] + "=" + 1);
	}
}