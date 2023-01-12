package collection;

import java.util.LinkedHashSet;

public class LinkedHS {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("cat");
		lh.add("bat");
		lh.add("rat");
		lh.add("123");
		lh.add("123");
		lh.add(null);
		System.out.println(lh);
	}
}
