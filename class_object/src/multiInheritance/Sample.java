package multiInheritance;

public class Sample {
public static void main(String[] args) {
	Demo3 d=new Demo3();
	d.run();
	d.display();
	d.print();
	System.out.println(Demo3.s);
	System.out.println(Demo3.c);
	System.out.println(Demo1.s);
	System.out.println(d.x);
	System.out.println(d.r);
}
}
