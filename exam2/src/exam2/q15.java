package exam2;

import java.util.HashSet;

public class q15 {

	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
	        set.add("1");
	        set.add("2");
	        set.add("3");
	        set.add("4");
	        set.add("5");
	  
	        System.out.println("Hash Set Contains :" + set);
	        String arr[] = new String[set.size()];
	          
	        int i=0;
	        
	        
	        for(String ele:set){
	          arr[i++] = ele;
	        }
	  
	        for (String n : arr)
	            System.out.println(n);
	    


	}

}
