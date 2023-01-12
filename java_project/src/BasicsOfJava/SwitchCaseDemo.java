package BasicsOfJava;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int size = 42;
		switch(size)
		{
			case 38:
			
				System.out.println("the size is 'S'");
				break;
			
			case 40:
				System.out.println("the size is 'M'");
				break;
			case 42:	// the cas value matches the size in swicth expression 
				System.out.println("the size is 'L'");
				break;
			case 44:
				System.out.println("the size is 'XL'");
				break;
			default:
				System.out.println("the size is unpecified");
		}
	}

}
