<<<<<<< HEAD
package javafeatures;
import java.util.List;
import java.util.*;

public class square {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(2);
		l.add(10);
		l.add(11);
		l.add(5);
		l.add(14);
		OptionalDouble a=l.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println(a);
		

	}

}
=======
package javafeatures;
import java.util.List;
import java.util.*;

public class square {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(2);
		l.add(10);
		l.add(11);
		l.add(5);
		l.add(14);
		OptionalDouble a=l.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println(a);
		

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
