package constructor;

public class Demo9 {
Demo9(){
	this(30);
	System.out.println("inside zero argument");
}
Demo9(int num){
	this("chaitra");
	System.out.println("inside integer argument");
}
Demo9(String name){
	System.out.println("inside string argument");
}
public static void main(String[] args) {
	Demo9 d= new Demo9();
	System.out.println("inside main method");
}
}
