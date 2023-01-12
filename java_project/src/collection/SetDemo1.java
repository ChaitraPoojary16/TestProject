package collection;

import java.util.HashSet;

public class SetDemo1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("cat");
		hs.add("bat");
		hs.add("rat");
		hs.add("123");
		hs.add("123");
		hs.add(null);
		System.out.println(hs);	
	}
}
