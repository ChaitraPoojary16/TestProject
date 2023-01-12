package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class listDemo {
	public static void main(String[] args) {

		ArrayList ll = new ArrayList();
		ll.add("cat");
		ll.add("bat");
		ll.add("rat");
		ll.add("bat");
		ll.add(123);
		ll.add(null);
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		
		ll.set(0, "pratap");
		System.out.println(ll);
		
		ll.remove(4);
		System.out.println(ll);
		
	}
}
