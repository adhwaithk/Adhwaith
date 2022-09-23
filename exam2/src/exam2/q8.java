package exam2;

import java.util.LinkedList;

public class q8 {

	public static void main(String[] args) {
		 LinkedList<Integer> ll = new LinkedList<>();
	        ll.add(1);
	        ll.add(2);
	        ll.add(5);
	        ll.add(4);
	        ll.add(3);
	        ll.add(6);
	        int element1 = 5;
	        int element2 = 3;
	  
	        System.out.println("Linked List Before Swapping :-");
	        for (int i : ll) {
	            System.out.println(i + " ");
	        }
	        int index1 = ll.indexOf(element1);
	        int index2 = ll.indexOf(element2);
	  
	        
	        if (index1 == -1 || index2 == -1) {
	            System.out.println("no element found ");
	            System.exit(0);
	        }
	            ll.set(index1, element2);
	            ll.set(index2, element1);
	       
	        System.out.println("Linked List After Swapping :-");
	        for (int i : ll) {
	            System.out.print(i + " ");
	        }
	  

	}

}
