package arraylist1;
import java.util.*;

public class arraylist1 {

	public static void main(String[] args) {
		ArrayList<String>array=new ArrayList<String>();
		array.add("red");
		array.add("blue");
		array.add("green");
		array.add("yellow");
		System.out.println("original list: "+array);
		System.out.println("return element: "+array.get(1));
		array.set(1,"black");
		System.out.println("newlist: "+array);

	}

}
