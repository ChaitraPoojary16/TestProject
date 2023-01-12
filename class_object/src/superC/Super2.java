package superC;

public class Super2 extends Super1 {
int x=20;
void update() {
	System.out.println(x);
	System.out.println(super.x);
	System.out.println("Inside Update");
	
}
}
