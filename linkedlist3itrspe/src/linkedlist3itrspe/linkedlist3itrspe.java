package linkedlist3itrspe;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist3itrspe {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("purple");
		list.add("green");
		list.add("red");
		list.add("blue");
		list.add("yellow");
		list.add("black");
		list.add("brown");
		ListIterator<String> P=list.listIterator(3);
		while(P.hasNext()) {
			System.out.println(P.next());
		}

	}

}
