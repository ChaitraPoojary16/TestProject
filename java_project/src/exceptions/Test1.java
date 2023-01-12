package exceptions;

public class Test1 {
	public static void main(String[] args) {
		int x = 10;

		Integer y = x;// autoboxing
		int z = y;// unboxing

		System.out.println(y);
		System.out.println(z);

		double p = 10;

		Double q = p;// autoboxing
		double r = p;// unboxing

	}
}
