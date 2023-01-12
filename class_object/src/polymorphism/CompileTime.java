package polymorphism;

public class CompileTime {

	int checkNum() {
		System.out.println("Inside zero arg method");
		return 0;
	}
	int checkNum(int n) {
		System.out.println("Inside one arg method");
		System.out.println(n);
		return 0;
	}
	int checkNum(String n, int m) {
		System.out.println("Inside two arg method");
		System.out.print(n+" ");
		System.out.println(m);
		return 20;
	}
	public static void main(String[] args) {
		CompileTime T=new CompileTime();
		int a=T.checkNum();
		int b=T.checkNum(8);
		int c=T.checkNum("Java",30);
		

		
	}
}
