package hierarchial;

public class Sample {
public static void main(String[] args) {
	Demo3 d=new Demo3();
	System.out.println(d.r);
	System.out.println(d.f);
	System.out.println(Demo3.s);
	System.out.println(Demo1.s);
	System.out.println(Demo3.c);
	d.print();
	d.run();
	
	System.out.println("********************");
	Demo2 d2=new Demo2();
	System.out.println(Demo1.s);
	System.out.println(d2.x);
	System.out.println(d2.r);
	d.print();
	d2.display();
	
}

}
