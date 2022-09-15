package hashmap8;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap8 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "black");
		hm.put(4, "yellow");
		hm.put(5, "blue");
		hm.put(6, "brown");
		System.out.println("hm: "+hm);
		System.out.println("enter value");
		Scanner sc1 = new Scanner(System.in);
		String a =sc1.next();
		if(hm.containsValue(a)) {
			System.out.println("yes");
		}else {
			System.out.println("no");

	}

}
}
