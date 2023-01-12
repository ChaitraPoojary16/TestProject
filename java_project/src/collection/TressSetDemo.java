package collection;

import java.util.*;

public class TressSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComapartor());
		ts.add(10);
		ts.add(90);
		ts.add(60);
		ts.add(60);
		ts.add(80);
		ts.add(100);
		ts.add(40);
		System.out.println(ts);
		
		//System.out.println("bat".compareTo("pat"));
		//System.out.println("pat".compareTo("bat"));
		//System.out.println("bat".compareTo("bat"));
		
		
		//System.out.println(ts.subSet("bat","rat"));
	}
}
