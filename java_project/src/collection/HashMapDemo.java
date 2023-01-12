package collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap mp = new HashMap();
		mp.put("chethan", 26);
		mp.put("pratap", 23);
		mp.put("neha", 23);
		mp.put("bhavani", 24);
		
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());

	}
}
