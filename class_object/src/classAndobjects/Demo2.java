package classAndobjects;

public class Demo2 {
	float x = 90.78f;
	char symbol = 'a';
	static String place = "Bangalore";

	public static void main(String[] args) {
		System.out.println(Demo2.place);
		Demo2 d = new Demo2();
		System.out.println(d.x);
		System.out.println(d.symbol);

		// creating one more reference variable d1.
		Demo2 d1 = new Demo2();
		System.out.println(d1.x);
		System.out.println(d1.symbol);

		// print the address of the object d1.(hash code value)
		System.out.println(d1);

	}
}
