package constructor;

public class Demo13 {
	void add(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Demo13 d = new Demo13();
		d.add(10, 80);

		System.out.println("inside main");
	}
}
