package pq4retfi;

import java.util.PriorityQueue;

public class pqretfi {

	public static void main(String[] args) {
		PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println("first pq: "+queue);
		PriorityQueue<Integer>queue1=new PriorityQueue<Integer>();
		System.out.println("first element: "+queue.peek());

	}

}
