package BasicsOfJava;

public class ControlStatementIfElse 
{
	public static void main(String[] args) {
		//true condition
		int x= 90;
		if(x>50)
		{
			System.out.println("inside if block");//condition true if block is executed
		}
		else
		{
			System.out.println("inside else block");
		}

		//false condition
		int y = 10;
		if(x>500)
		{
			System.out.println("inside if block");
		}
		else
		{
			System.out.println("inside else block");//condition false else block is executed
		}
	}
}
