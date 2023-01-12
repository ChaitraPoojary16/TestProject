package Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(10);
	a.add(60);
	a.add(0);
	System.out.println(a);
	Iterator i=a.iterator();
	while(i.hasNext()) {
		int i1=(Integer)i.next();
		System.out.println(i1);
	}
	
}
}
