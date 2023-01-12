package collection;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.offer("chethan");
		pq.offer("pratap");
		pq.offer("neha");
		pq.offer("teja");
		pq.offer("teja");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
