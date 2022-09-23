package exam2;

import java.util.LinkedList;

public class q7 {

	public static void main(String[] args) {
		 LinkedList<String> l1 = new LinkedList<String>();
	      l1.add("virat");
	      l1.add("rohit");
	      l1.add("dhoni");
	      System.out.println("The list is defined as: " +l1);
	      l1.addFirst("sachin");
	      l1.addLast("yuvi");
	      System.out.println("The list after adding elements is: " + l1);

	}

}
