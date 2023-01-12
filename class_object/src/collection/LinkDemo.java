package collection;

import java.util.LinkedList;

public class LinkDemo {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(null);
	list.add("cat");
	list.add(3.14f);
	
	System.out.println(list);
	
	list.addFirst("Raj");
	System.out.println(list);

	list.addLast("Chaitra");
	System.out.println(list);
	
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	System.out.println(list.removeLast());
	System.out.println(list.removeFirst());
	System.out.println(list);
	System.out.println(list.remove(2));
	System.out.println(list);
	list.clear();
	System.out.println(list);
	}
}
