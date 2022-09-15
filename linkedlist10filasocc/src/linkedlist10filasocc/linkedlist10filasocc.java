package linkedlist10filasocc;

import java.util.LinkedList;
import java.util.Iterator;

public class linkedlist10filasocc {

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
		Object first = list.getFirst();
		System.out.println("first element is: "+first);
		Object last = list.getLast();
		System.out.println("last element is: "+last);
		

	}

}
