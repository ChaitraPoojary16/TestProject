package Cursor;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	li.add("cat");
	li.add("rat");
	li.add("bat");
	li.add("dog");
	System.out.println(li);
	ListIterator i=li.listIterator();
	while(i.hasNext()) {
		String m=(String)i.next();
		System.out.println(m);
		
	}
	System.out.println("");
	while(i.hasPrevious()) {
		String m=(String)i.previous();
		System.out.println(m);
	}
}
}
