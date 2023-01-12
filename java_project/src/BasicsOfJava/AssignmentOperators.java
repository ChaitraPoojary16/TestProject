package BasicsOfJava;

public class AssignmentOperators {
	public static void main(String[] args) {

		int a = 10, b = 20, c;
		boolean x = true;
		
		System.out.println("a = " + a + ", b = " + b);
		
		int p = 30;
		p+=20;// add p with 20 and then assign the result back to p
		System.out.println("p = "+p);
		
		a += b;
		System.out.println("a = " + a);
		
		a -= b;
		System.out.println("a = " + a);
		
		a *= b;
		System.out.println("a = " + a);
		
		a /= b;
		System.out.println("a = " + a);
		
		a %= b;
		System.out.println("a = " + a);
		
		x |= (a>b);
		System.out.println("x = " + x);
		
		x &= (a>b);
		System.out.println("x = " + x);
	}
}
