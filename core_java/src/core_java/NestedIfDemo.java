package core_java;

public class NestedIfDemo {
	public static void main(String[] args)
	{
	int pin=1234;
	int withdrawal=5000;
	int accbal=10000;
	if(pin==1234) {
		if(accbal>withdrawal)
		{
			System.out.println("Amount withdrawal successfull");
	accbal=accbal-withdrawal;
	System.out.println("Your account balance is " +accbal);
	
		}
		else
		{
			System.out.println("Insufficient funds ");
		}
	}
		else
		{
			System.out.println("Incorrect password");
		}
	}
	
	}

