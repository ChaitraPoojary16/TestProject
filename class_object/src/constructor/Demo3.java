package constructor;

public class Demo3 {
	//multi argumented constructor
Demo3(int age, String name){
	System.out.println("Inside constructor");
	System.out.println(age);
	System.out.println(name);
}
public static void main(String[] args) {
	System.out.println("Inside main method");
	Demo3 d=new Demo3(20,"Chaitra");
	System.out.println("Execution Completed");
}
}
