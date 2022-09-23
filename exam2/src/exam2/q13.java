package exam2;

import java.util.LinkedList;

public class q13 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		  
       
        list.add("hi");
        list.add("how");
        list.add("are");
        list.add("you");
        list.add("2022");
  
      
        System.out.println("LinkedList:\t" + list);
  
        
        System.out.println("The last element is removed:\t" + list.removeLast());
          
    
        System.out.println("Final LinkedList:\t" + list);
          
        
        System.out.println("The first element is removed:\t" + list.removeFirst());
  
       
        System.out.println("Final LinkedList:\t" + list);

	}

}
