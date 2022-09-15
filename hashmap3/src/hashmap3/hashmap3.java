package hashmap3;

import java.util.*;

public class hashmap3 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "black");
		System.out.println("first hm: "+hm);
		HashMap<Integer,String>hm1=new HashMap<Integer,String>();
		hm1.put(4, "yellow");
		hm1.put(5, "blue");
		hm1.put(6, "brown");
		System.out.println("second hm: "+hm1);
		hm1.putAll(hm);
		System.out.println("copy: "+hm1);

	}

}
