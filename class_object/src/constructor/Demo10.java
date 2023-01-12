package constructor;

public class Demo10 {
void add() {
	int a=10,b=20;
	int sum=a+b;
	System.out.println(sum);
}
public static void main(String[] args) {
	Demo10 d=new Demo10();
	d.add();
	System.out.println("inside");
}

}
