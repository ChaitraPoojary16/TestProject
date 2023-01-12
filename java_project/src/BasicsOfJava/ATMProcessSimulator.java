package BasicsOfJava;

import java.util.Scanner;

public class ATMProcessSimulator 
{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int accountBalance= 6000;
		int password = 1234;
		System.out.println("Welcome to Bank. Please insert your card");
		System.out.println("Please wait while we read your card");
		int userEnteredpwd = readPin();
		accountBalance = verifyPin(userEnteredpwd, password, accountBalance);
	}

	 static int verifyPin(int enteredPwd, int originalPwd, int accountBalance) {
		 						// 1234, 1234, 6000
		int balance = 0;
		if(enteredPwd == originalPwd)
		{
			System.out.println("Enter the amount");
			int amount = scn.nextInt();
			if(amount<accountBalance)
			{
				System.out.println("transaction successful");
				balance = accountBalance - amount;
				System.out.println("your account balance is "+balance);
			}
			else
			{
				System.out.println("Insufficient balance");
				balance = accountBalance;
				System.out.println("your account balance is "+balance);
			}
		}
		else
		{
			System.out.println("Incorrect Password. Transaction declined");
		}
		return balance;
	}

	static int readPin() 
	{
		System.out.println("Please enter your pin");
		int pin = scn.nextInt();
		return pin;	
	}


}
