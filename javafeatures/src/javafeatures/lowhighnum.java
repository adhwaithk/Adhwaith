<<<<<<< HEAD
package javafeatures;
import java.util.Comparator;
import java.util.stream.*;

public class lowhighnum {

	public static void main(String[] args) {
		Integer highest=Stream.of(1,2,3,77,6,5)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
		Integer lowest=Stream.of(1,2,3,77,6,5)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		System.out.println("highest number: "+highest);
		System.out.println("lowest number: "+lowest);
		
		

	}

}
=======
package javafeatures;
import java.util.Comparator;
import java.util.stream.*;

public class lowhighnum {

	public static void main(String[] args) {
		Integer highest=Stream.of(1,2,3,77,6,5)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
		Integer lowest=Stream.of(1,2,3,77,6,5)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		System.out.println("highest number: "+highest);
		System.out.println("lowest number: "+lowest);
		
		

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
