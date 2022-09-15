package treeset5;
import java.util.*;

public class treeset5 {

	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<Integer>();
		TreeSet<Integer>ths=new TreeSet<Integer>();	
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);
		ts.add(10);
		ths=(TreeSet)ts.headSet(7);
		Iterator it;
		it=ths.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
			
		}
		
		

	}

}
