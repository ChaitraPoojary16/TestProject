package constructor;

public class Demo {
static void sub(int a , int b) {
	int diff=a-b;
	System.out.println(diff);
}
public static void main(String[] args) {
	Demo d = new Demo();
	d.sub(20, 10);
	
}
}
