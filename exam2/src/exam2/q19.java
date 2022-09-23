package exam2;

import java.util.TreeSet;

public class q19 {

	public static void main(String[] args) {
		TreeSet<String> t_set1 = new TreeSet<String>();
	     
	          t_set1.add("Red");
	          t_set1.add("Green");
	          t_set1.add("Black");
	          t_set1.add("White");
	          System.out.println("Free Tree set: "+t_set1);

	          TreeSet<String> t_set2 = new TreeSet<String>();
	          t_set2.add("Red");
	          t_set2.add("Pink");
	          t_set2.add("Black");
	          t_set2.add("Orange");
	          System.out.println("Second Tree set: "+t_set2);
	          System.out.println(t_set2.equals(t_set1));
	          
	        
	}

}

