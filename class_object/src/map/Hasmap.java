package map;

import java.util.HashMap;

public class Hasmap {
public static void main(String[] args) {
	HashMap mp=new HashMap();
	mp.put("Charan", 30);
	mp.put("Chethan", 30);
	mp.put("ganesh", 23);
	mp.put("Charan", 50);
	System.out.println(mp);
	System.out.println(mp.keySet());
	System.out.println(mp.values());
}
}
