package exam2;

import java.util.Collections;
import java.util.LinkedList;

public class q10 {

	public static void main(String[] args) {
		 LinkedList<String> linkedList = new LinkedList<String>();
	        linkedList.add("red");
	        linkedList.add("white");
	        linkedList.add("black");
	        linkedList.add("Violet");
	        linkedList.add("brown");
	        linkedList.add("green");
	        System.out.println("Actual LinkedList:"+linkedList);
	        Collections.shuffle(linkedList);
	            System.out.println("Results after shuffle operation:" + linkedList);      
	            Collections.shuffle(linkedList);
	            System.out.println("Results after shuffle operation:" + linkedList);

	}

}
