package constructor;

public class DemoC {
DemoC(){
	System.out.println("Hello from constructor");
}
void my_method()//method
{
	System.out.println("Hello from method");
}
public static void main(String[] args) {
	DemoC obj=new DemoC();
	obj.my_method();
	}
}
