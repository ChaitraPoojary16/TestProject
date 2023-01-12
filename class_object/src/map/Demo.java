package map;

import java.util.LinkedHashMap;

public class Demo {
	public static void main(String[] args) {

		LinkedHashMap mp = new LinkedHashMap();
		mp.put("Charan", 30);
		mp.put("Chethan", 30);
		mp.put("ganesh", 23);
		mp.put("Charan", 50);
		mp.put("Ravi", 77);
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
	}
}