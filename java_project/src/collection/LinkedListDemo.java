package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add("cat");
		li.add("bat");
		li.add("rat");
		li.add("bat");
		li.add(123);
		li.add(null);
		System.out.println(li);

		li.addFirst("pen");
		li.addLast("pencil");
		System.out.println(li);

		System.out.println(li.getFirst());
		System.out.println(li.getLast());

		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);

	}
}
