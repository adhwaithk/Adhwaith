package linkedlist4itrrev;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist4itrrev {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("red");
		list.add("blue");
		list.add("purple");
		list.add("black");
		list.add("brown");
		list.add("yellow");
		list.add("pink");
		System.out.println("original list = "+list);
		Iterator it = list.descendingIterator();
		System.out.println("elements in reverse order: ");
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}
