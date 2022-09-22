<<<<<<< HEAD
package javafeatures;
import java.util.*;

public class sumarraylist {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
				
		int sum=list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println(sum);

}
}
=======
package javafeatures;
import java.util.*;

public class sumarraylist {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
				
		int sum=list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println(sum);

}
}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
