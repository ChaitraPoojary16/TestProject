package BasicsOfJava;

public class ControlStatementsNestedIfElse {
	public static void main(String[] args) {
		int y = 90;
		if(y > 0)//true
		{
			System.out.println("inside parent if block");
			int x=90;
			if(x > 50)//true
			{
				System.out.println("inside nested if block");
			}
			else
			{			
				System.out.println("inside nested else block");
			}
		}
		else
		{
			System.out.println("inisde parent else block");
		}
	}
}
