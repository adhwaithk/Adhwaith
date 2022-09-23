package exam2;

import java.util.LinkedList;

public class q11 {

	public static void main(String[] args) {
		
        LinkedList<String> l = new LinkedList<String>();
        
        l.add("red");
        l.add("white");
        l.add("black");
        l.add("brown");
        l.add("violet");
        
        System.out.println("The elements of LinkedList are: "+l);
        
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: " + clone);

	}

}
