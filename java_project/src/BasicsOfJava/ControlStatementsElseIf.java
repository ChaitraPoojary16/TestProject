package BasicsOfJava;

public class ControlStatementsElseIf {

	public static void main(String[] args) {
		
		int marks = 65;
		if(marks > 85)
		{
			System.out.println(" Grade is A");
		}
		else if(marks > 60 || marks < 85)
		{
			System.out.println(" Grade is B");
		}
		else if(marks > 45 || marks < 60)
		{
			System.out.println(" Grade is C");
		}
		else 
		{
			System.out.println(" Grade is D");
		}
	}
}
