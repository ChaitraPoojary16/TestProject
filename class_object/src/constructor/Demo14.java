package constructor;

public class Demo14 {
	void add() {
		int a = 20, b = 30;
		int sum = a + b;
		System.out.println(sum);
	}

	void multi(int x) {
		int multi = x * 100;
		System.out.println(multi);
	}

	static void div(int a, int b) {
		int div = a / b;
		System.out.println(div);
	}

	static void printName(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Demo14 d=new Demo14();
		d.add();
		d.multi(5);
		Demo14.div(20, 5);
		Demo14.printName("Chaitra");
	}
}
