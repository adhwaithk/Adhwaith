package hashmap10;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap10 {

	public static void main(String[] args) {
		int a;
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "black");
		hm.put(4, "yellow");
		hm.put(5, "blue");
		hm.put(6, "brown");
		System.out.println("hm: "+hm);
		System.out.println("enter key");
		Scanner sc1 = new Scanner(System.in);
		a =sc1.nextInt();
		String val=(String)hm.get(a);
		System.out.println("value is: "+val);

	}

}
