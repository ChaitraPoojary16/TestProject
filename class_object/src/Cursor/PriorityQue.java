package Cursor;

import java.util.PriorityQueue;

public class PriorityQue {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.offer("Chaitra");
	pq.offer("Charan");
	pq.offer("Dhruvi");
	pq.offer("Dhyan");
	pq.offer("Harish");
	System.out.println(pq);
	
	System.out.println(pq.peek());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
}
}
