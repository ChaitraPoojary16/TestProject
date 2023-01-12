package BasicsOfJava;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 * Increment ++ and decrement -- operators increase the value by 1 or decrease the value by one
		 * pre increment ++i
		 * post increment i++
		 * pre decrement --i
		 * post decrement i--
		 */
	/*	int x = 12;int y = 21;
		x++; 
		y++; 
		System.out.println("the value of x is "+x);
		System.out.println("the value of y is "+y);		

		int a =1; int b=1; 
		++a; ++b; 
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);	*/

	/*	int p=1; int q=1; 
		int j = p++;//first assign then increment 
		int k = ++q;//increment then assign 
		System.out.println("the value of j is "+j);
		System.out.println("the value of p is "+p);
		
		System.out.println("the value of q is "+q);
		System.out.println("the value of k is "+k);	*/

	/*
	 * int l=1; int m=1; //int e = l--; //assign then decrement int f =
	 * --m;//decrement then assign //System.out.println("the value of e is "+e);
	 * System.out.println("the value of f is "+f);
	 */
		
		/*Assignemnet
		 * int x=1;y=1;
		 * int k = x++ + ++x + x++ + x + x++;
		 * int l = ++y + ++y + ++y + y++ + y;
		 * 
		 */
		
		int x=10,y=10;
		int temp1= y++ + y++ + y;
		System.out.println("temp1="+temp1);
		
		int temp2 = x++ + x + ++x + x++;
		System.out.println("temp2="+temp2);
		
	}

}
