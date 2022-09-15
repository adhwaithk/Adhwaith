package linkedlist11speele;

import java.util.LinkedList;

public class linkedlist11speele {

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
		list.remove("pink");
		System.out.println("new linked list: "+list);

	}

}
