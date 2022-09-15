package treeset3;
import java.util.*;

public class treeset3 {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("red");
		ts.add("yellow");
		ts.add("orange");
		ts.add("black");
		ts.add("white");
		System.out.println("original treeset: "+ts);
		Iterator it=ts.descendingIterator();
		System.out.println("reverse order: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
