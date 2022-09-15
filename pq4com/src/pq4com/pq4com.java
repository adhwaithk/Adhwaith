package pq4com;
import java.util.PriorityQueue;

public class pq4com {

	public static void main(String[] args) {
		PriorityQueue<String>queue=new PriorityQueue<String>();
		queue.add("red");
		queue.add("blue");
		queue.add("green");
		queue.add("yellow");
		queue.add("white");
		System.out.println("first pq: "+queue);
		PriorityQueue<String>queue1=new PriorityQueue<String>();
		queue1.add("red");
		queue1.add("blue");
		queue1.add("violet");
		queue1.add("white");
		queue1.add("brown");
		System.out.println("second pq: "+queue1);
		for(String element:queue) {
			System.out.println(queue1.contains(element)? "yes":"no");
		}
		
		
		
		
		

	}

}
