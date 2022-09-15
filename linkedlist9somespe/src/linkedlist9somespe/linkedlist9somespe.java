package linkedlist9somespe;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist9somespe {

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
		LinkedList<String>newlist=new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String str1=sc.next();
		newlist.add(str);
		newlist.add(str1);
		list.addAll(1,newlist);
		System.out.println("new linked list: "+list);

	}

}
