package ConstructorsInJava;

public class Constructors {
	String collegeName;
	
	Constructors(String s)
	{
		System.out.println("inside parameterized constructor");
		collegeName = s;
	}
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors("VTU");
		System.out.println("inside main method1");
		System.out.println("instance varialble value is "+obj.collegeName);
	
	
		Constructors obj2 = new Constructors("BU");	
		System.out.println("inside main method2");
		System.out.println("instance varialble value is "+obj2.collegeName);
	}
}
