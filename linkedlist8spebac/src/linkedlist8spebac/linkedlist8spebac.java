package linkedlist8spebac;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist8spebac {

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
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		list.offerLast(str);
		System.out.println("new linked list: "+list);

	}

}
