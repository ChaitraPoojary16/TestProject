package classAndobjects;

public class Demo3 {
	float x = 90.78f;
	char symbol = 'a';
	static String place = "Bangalore";

	public static void main(String[] args) {
		System.out.println(Demo3.place);
		Demo3 d = new Demo3();
		System.out.println(d.x);
		System.out.println(d.symbol);

		// creating one more reference variable d1 and changing the values.
		Demo3 d1 = new Demo3();
		d1.symbol='c';
		d1.x=99;
		System.out.println(d1.x);
		System.out.println(d1.symbol);
	}
}