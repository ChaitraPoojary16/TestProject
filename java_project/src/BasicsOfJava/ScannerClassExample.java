package BasicsOfJava;

import java.util.Scanner;
public class ScannerClassExample 
{
	public static void main(String[] args) {
		//syntax for scanner class
		Scanner scn = new Scanner(System.in);

		//taking int as input
		System.out.println("Enter your lucky number");
		int yourNumber = scn.nextInt();
		System.out.println("Lucky number is "+yourNumber);

		//taking string as input
		System.out.println("Enter your Name");
		String name = scn.next();
		System.out.println("Name is "+name);
		
		//taking double as input
		System.out.println("Enter your Weight");
		double weight = scn.nextDouble();
		System.out.println("Weight is "+weight);
	}
}
