package constructor;

public class Demo12 {
	static void add(int a, int b) {
		
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Demo12.add(10,20);
		
		System.out.println("inside");
	}
}
