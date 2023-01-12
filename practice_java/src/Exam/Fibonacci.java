package Exam;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		int n, a = 0, b = 0, c = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a value for n");
		n = scn.nextInt();
		System.out.println("Fibonacci Series are");
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
	}
}