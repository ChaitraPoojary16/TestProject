package BasicsOfJava;

public class LogicalOperators {
	public static void main(String[] args) {int x = 10, y = 20, z = 0;
	boolean a = true, b;
	// first part false so second part is not executed
	a = x>y && (z=x+y)>15;
	System.out.println("a = " + a + ", and z = " + z);
	
	// first part true so second part is executed value of z is changed
	b = x<y && (z=x+y)>15;
	System.out.println("b = " + b + ", and z = " + z);
	
	//example for & where both parts are executed
	  a = x>y & (z=x+y)>15; 
	  System.out.println("a = " + a + ", and z = " + z);}
}
