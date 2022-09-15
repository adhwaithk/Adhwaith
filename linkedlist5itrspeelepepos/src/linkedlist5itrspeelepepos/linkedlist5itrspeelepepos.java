package linkedlist5itrspeelepepos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist5itrspeelepepos {

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
		System.out.println("add orange at pos 2");
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		list.add(str);
		list.add(2,str);
		System.out.println("new linked list: "+list);

}
}
