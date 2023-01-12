package BasicsOfJava;

import java.util.Scanner;

public class ScannerClassDemo {
	 public static void main(String[] args) {
		    
//-------------------------------------------
		    // creates a Scanner object
		    Scanner input2 = new Scanner(System.in);

		    System.out.println("Enter an integer: ");

		    // reads an int value
		    int data1 = input2.nextInt();

		    System.out.println("Using nextInt(): " + data1);

		    input2.close();

		    // creates an object of Scanner
		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter your name: ");

		    // takes input from the keyboard
		    String name = input.nextLine();

		    // prints the name
		    System.out.println("My name is " + name);

		    // closes the scanner
		 
		    input.close();

		  //-------------------------------------------
		    // creates an object of Scanner
		    Scanner input3 = new Scanner(System.in);
		    System.out.print("Enter your name: ");

		    // reads the entire word
		    String value = input3.next();
		    System.out.println("Using next(): " + value);

		    input3.close();
		  //-------------------------------------------
		    
		  }
}
