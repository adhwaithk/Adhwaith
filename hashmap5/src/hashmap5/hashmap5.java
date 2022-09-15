package hashmap5;

import java.util.HashMap;

public class hashmap5 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "black");
		hm.put(4, "yellow");
		hm.put(5, "blue");
		hm.put(6, "brown");
		boolean result=hm.isEmpty();
		System.out.println("hash map: "+result);
		hm.clear();
		result=hm.isEmpty();
		System.out.println("hash map: "+result);
		

	}

}
