package hash2clone;

import java.util.HashSet;

public class hash2clone {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("red");
		hs.add("blue");
		hs.add("white");
		hs.add("brown");
		System.out.println(" original hash set: "+hs);
		HashSet<String>hs1=new HashSet<String>();
		hs1=(HashSet)hs.clone();
		System.out.println("cloned hash set: "+hs1);

	}

}
 