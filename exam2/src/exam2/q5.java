package exam2;

import java.util.ArrayList;
import java.util.Collections;

public class q5 {

	public static void main(String[] args) {
		 ArrayList<String> input_list = new ArrayList<String>();
         input_list.add("sachin");
         input_list.add("is");
         input_list.add("good");
         input_list.add("batsman");
         System.out.println("The list is defined as: " + input_list);
         Collections.sort(input_list);
         System.out.println("The sorted list is: " + input_list);

	}

}
