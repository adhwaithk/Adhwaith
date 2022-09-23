package exam2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class q9 {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
	        list.add("white");
	        list.add("brown");
	        list.add("black");
	        list.add("grey");
	        list.add("green");
	        list.add("yellow");
	        System.out.println("Actual LinkedList:"+list);
	        List<String> list1 = new ArrayList<String>(list);
	           
	            System.out.println("Results after to array operation:" + list1);

	}

}
