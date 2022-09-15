package pq2inser;

import java.util.PriorityQueue;
import java.util.Scanner;

public class pq2inser {

	public static void main(String[] args) {
		PriorityQueue<String>queue=new PriorityQueue<String>();
		queue.add("red");
		queue.add("blue");
		queue.add("green");
		queue.add("yellow");
		queue.add("white");
		System.out.println("pqueue: "+queue);
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		queue.add(str);
		System.out.println(queue);
		

	}

}
