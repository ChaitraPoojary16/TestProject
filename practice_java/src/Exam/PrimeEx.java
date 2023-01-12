package Exam;

import java.util.Scanner;

public class PrimeEx {
	public static void main(String[] args) {
		int n, count = 0;
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				count++;
			}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("Not prime");
		}

	}
}
