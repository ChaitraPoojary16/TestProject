package accessModifiers2;

import accessModifiers.Demo1;

public class Sample1 extends Demo1 {

	void test() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.view("xycs");
	}
}
