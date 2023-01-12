package polymorphism;

public class Overload {
void printName() {
	System.out.println("Inside printname method");
}
void printName(String args) {
	System.out.println(args);
	System.out.println("Inside printname method with args"); 
}
void printName(String arg1, int n, double m) {
	System.out.println(arg1);
	System.out.println(n);
	System.out.println(m);
	System.out.println("Inside printname method with 3 args");
}
public static void main(String[] args) {
	Overload obj=new Overload();
	obj.printName();
	obj.printName("HAi");
	obj.printName("hai",10,45.00);
}
}
