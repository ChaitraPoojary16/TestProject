package BasicsOfJava;

public class ArithmeticOperators {
	public static void main(String[] args) {

		int a = 10, b = 20, result;

		System.out.println("a = " + a + ", b = " + b);
		
		result = a + b;//30
		System.out.println("Addition : "+ result);
		System.out.println("the sum of two numers = "+result);
		
		result = a - b;//-10
		System.out.println("Subtraction : "+ result);
		
		result = a * b;//200
		System.out.println("Multiplucation : "+ result);
		
		result = b / a;//2
		System.out.println("Division : "+ result);
		
	//	int  x = 15, y = 5;
		result = a % b;//remainder 2
		System.out.println("Modulus : " + result);
		
		result = ++a;
		System.out.println("Pre-increment : " + result);
		
		result = b--;
		System.out.println("Post-decrement : " + result);
	}
}
