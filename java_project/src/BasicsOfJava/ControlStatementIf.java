package BasicsOfJava;

public class ControlStatementIf {

	public static void main(String[] args) {
		// true condition
		int y = 45;
		if (y < 50) {
			System.out.println("Inside first if block");
		}
		// false condition
		int x = 10;
		if (x > 20) {
			System.out.println("Inside second if block");//not executed becoz the condition is false
		}
	}
}
