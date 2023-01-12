package constructor;

public class Demo5 {
	int id;
	double salary;

	Demo5(int i, double sal) {
		id = i;
		salary = sal;
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		Demo5 d = new Demo5(101, 15000.0);
		System.out.println(d.id);
		System.out.println(d.salary);
	}
}
