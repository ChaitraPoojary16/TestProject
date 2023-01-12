package StringsInJava;

public class ReverseAString {
	public static void main(String[] args) {
		String s1 = "Selenium";

		char[] ary = s1.toCharArray();
		for (int i = ary.length; i > 0; i--) {
			System.out.print(ary[i - 1]);
		}

	}

}
