package BasicsOfJava;

public class TypeCastingNarowing {
	 public static void main(String[] args) {
		    // create double type variable
		    float num = 90.89f;
		    System.out.println("The float value: " + num);

		    // convert into int type
		    int data = (int)num;
		    System.out.println("The integer value: " + data);
		    
		    long value = 90809807989l;
		    int longValue = (int) value;
		    System.out.println("The integer value: " + longValue);
		  }
}
