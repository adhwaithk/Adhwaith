<<<<<<< HEAD
package javafeatures;
import java.util.*;


public class stringlen {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Adhwaith");
		s.add("Akshay");
		s.add("Krishnapriya");
		s.add("Irene");
		Long n=s.stream().filter(str->(str.length()>5)).count();
		System.out.println(n);
		

	}

}
=======
package javafeatures;
import java.util.*;


public class stringlen {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Adhwaith");
		s.add("Akshay");
		s.add("Krishnapriya");
		s.add("Irene");
		Long n=s.stream().filter(str->(str.length()>5)).count();
		System.out.println(n);
		

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
