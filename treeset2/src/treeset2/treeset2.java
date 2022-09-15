package treeset2;

import java.util.TreeSet;

public class treeset2 {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("red");
		ts.add("yellow");
		ts.add("orange");
		ts.add("black");
		ts.add("white");
		for(String element : ts) {
			System.out.println(element);
		}

	}

}
