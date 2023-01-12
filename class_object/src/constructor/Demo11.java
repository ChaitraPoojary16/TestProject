package constructor;

public class Demo11 {
	static void add() {
		int a=10,b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		Demo11.add();
		System.out.println("inside main method with static returntype");
	}
}
