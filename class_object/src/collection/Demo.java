package collection;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(10);
	l.add(null);
	l.add("cat");
	l.add(3.14f);
	
	System.out.println(l);
	System.out.println(l.size());
	System.out.println(l.get(2));
	l.add(0,"chaitra");//add object at specific index
	System.out.println(l);
	l.remove(1);
	System.out.println(l);
	l.set(4, "Ram");
	System.out.println(l);
}
}
