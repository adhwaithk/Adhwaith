package linkedlist6fila;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist6fila {

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
		Scanner sc1 = new Scanner(System.in);
		String str =sc.next();
		String str1=sc1.next();
		list.addFirst(str);
		list.addLast(str1);
		System.out.println("new linked list: "+list);

	}

}
