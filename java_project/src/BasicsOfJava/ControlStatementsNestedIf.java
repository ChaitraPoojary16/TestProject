package BasicsOfJava;

public class ControlStatementsNestedIf {
	public static void main(String[] args)
	{
		int x = 90;
		if (x > 0) 
		{
			System.out.println("inside parent if block");
			if (x > 50)
			{
				System.out.println("inside nested if block");
			}
		}

	}
}
