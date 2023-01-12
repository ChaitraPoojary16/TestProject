package Programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		String str, reversedStr = "";
		System.out.println("Enter a string");

		Scanner scn = new Scanner(System.in);
		str = scn.nextLine();
		int s = str.length();

		for (int i = str.length() - 1; i >= 0; i--)
			reversedStr = reversedStr + str.charAt(i);

		System.out.println("Original string: " + str);

		System.out.println("Reverse of given string: " + reversedStr);
	}
}
