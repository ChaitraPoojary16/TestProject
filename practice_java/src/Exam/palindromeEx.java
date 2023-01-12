package Exam;

import java.util.Scanner;

public class palindromeEx {
	public static void main(String[] args) {
		String str, rev = "";
		System.out.println("Enter a Srting");
		Scanner scn = new Scanner(System.in);
		str = scn.nextLine();
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println("Is palindrome");
		else
			System.out.println("Is not palindrome");

	}
}
