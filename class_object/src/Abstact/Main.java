package Abstact;

public class Main extends Demo1{
void insert() {
	System.out.println("Inside insert method");
}
public static void main(String[] args) {
	Main m=new Main();
	m.insert();
	m.check();
	System.out.println(m.x);
}
}
