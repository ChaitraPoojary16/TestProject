package BasicsOfJava;

public class TypeConversion {

	public static void main(String[] args) {
		//Type conversion from String to int 
	    // create string type variable
	    String data3 = "346";
	    System.out.println("The string value is: " + data3);

	    // convert string variable to int
	    int num3 = Integer.parseInt(data3);
	    System.out.println("The integer value is: " + num3);
	    System.out.println(num3+10);
	    
	    
	  //Type conversion from int to String
	    // create int type variable
	    int num2 = 10;
	    System.out.println("The integer value is: " + num2);

	    // converts int to string type
	    String data2 = String.valueOf(num2);
	    System.out.println("The string value is: " + data2);
	    System.out.println(data2+10);
	  }
}
