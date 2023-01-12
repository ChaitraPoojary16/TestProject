package constructor;

public class Demo2 {
	//Argumented constructor
Demo2(String name){
	System.out.println("Inside constructor");
	System.out.println(name);
}
public static void main(String[] args) {
	System.out.println("Inside main method");
	Demo2 d=new Demo2("Charan");
	System.out.println("Inside main method");
}
}
