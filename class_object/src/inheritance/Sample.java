package inheritance;

public class Sample {
public static void main(String[] args) {
	InheritB i=new InheritB();
	i.view();
	i.check();
	System.out.println(i.a);
	System.out.println(i.s);
	//calling static variable of parent class
	System.out.println(InheritA.k);
}
}
