package treeset4;

import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("red");
		ts.add("yellow");
		ts.add("orange");
		ts.add("black");
		ts.add("white");
		System.out.println("treeset: "+ts);
		Object fs=ts.first();
		Object ls=ts.last();
		System.out.println("first element is: "+fs +" last element is: " +ls);

	}

}
