package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(40);
	v.add(90);
	v.add(0);
	v.add(30);
	v.add(10);
	System.out.println(v);
	Enumeration  e=v.elements();
	while(e.hasMoreElements()) {
		int i=(Integer)e.nextElement();
		System.out.println(i);
	}
}
}
