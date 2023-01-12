package BasicsOfJava;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//without using third variable
		int a=20;
		int b=40;
		a = a+b;//(a=30)
		b=a-b;//(10)
		a=a-b;//(20)
		
		System.out.println("the value of b is "+a);
		System.out.println("the value of a is "+b);
		
		//introduce third variable c
		int c;
		c = a;//c=40
		a = b;//a=20
		b = c;//b=40
		System.out.println("after third varaible");
		System.out.println("the value of b is "+a);
		System.out.println("the value of b is "+b);
		
		

	}

}
