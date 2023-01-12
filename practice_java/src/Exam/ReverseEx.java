package Exam;

import java.util.Scanner;

public class ReverseEx {
	public static void main(String[] args) {
		String str, revstr = "";

		System.out.println("Enter a String");
		Scanner scn = new Scanner(System.in);
		str = scn.nextLine();

		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			revstr = revstr + str.charAt(i);
		System.out.println("Original String " +str);
		System.out.println("Reversed string " +revstr);
	}
}
