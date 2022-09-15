package hash3compint;

import java.util.HashSet;

public class hash3compint {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("red");
		hs.add("blue");
		hs.add("white");
		hs.add("brown");
		System.out.println(" first hash set: "+hs);
		HashSet<String>hs1=new HashSet<String>();
		hs1.add("yellow");
		hs1.add("green");
		hs1.add("red");
		hs1.add("blue");
		System.out.println(" second hash set: "+hs1);
		hs.retainAll(hs1);
		System.out.println("content: "+hs);
		

	}

}
