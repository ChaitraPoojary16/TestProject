package ConstructorsInJava;

public class NoArgConstructor2 {
	int phno;
	String school;   
	NoArgConstructor2()
	{
		System.out.println("inside no argument constructor");
		this.phno = 234567;
		this.school = "Deli Pulic School";
	}
	public static void main(String[] args) 
	{
		NoArgConstructor2 obj =  new NoArgConstructor2();
		System.out.println(obj.phno);
		System.out.println(obj.school);
	}


}
