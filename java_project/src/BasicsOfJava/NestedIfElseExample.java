package BasicsOfJava;

public class NestedIfElseExample {
	public static void main(String[] args) {
		int accountBalance = 6000;
		int amount = 1000;
		int password = 1234;
		int enteredPwd = 1234;
		if (enteredPwd == password)//condition is true enter the if block
		{
			System.out.println("Enter the amount = "+amount);
			if (amount < accountBalance)//condition is true nested if is executed
			{
				System.out.println("transaction successful");
				accountBalance = accountBalance - amount;
				System.out.println("your account balance is " + accountBalance);
			} 
			else
			{
				System.out.println("Insufficient balance");
				System.out.println("your account balance is " + accountBalance);
			}
		}
		else
		{
			System.out.println("Incorrect Password. Transaction declined");
		}
	}
}
