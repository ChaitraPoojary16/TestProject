package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cursordemo {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("cat");
		li.add("bat");
		li.add("rat");
		li.add("mat");
		System.out.println(li);

		ListIterator i = li.listIterator();		
		while (i.hasNext()) {
			String m = (String) i.next();
			System.out.println(m);
		}
		System.out.println("");
		while (i.hasPrevious()) {
			String m = (String) i.previous();
			System.out.println(m);
		}
	}
}
