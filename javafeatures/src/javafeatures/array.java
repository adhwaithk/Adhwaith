<<<<<<< HEAD
package javafeatures;
import java.util.Arrays;
import java.util.stream.IntStream;

public class array {

	public static void main(String[] args) {
		int arr[]= {99,55,203,99,4,91};
		Arrays.parallelSort(arr);
		IntStream s=Arrays.stream(arr);
		s.forEach(System.out::println);
		

	}

}
=======
package javafeatures;
import java.util.Arrays;
import java.util.stream.IntStream;

public class array {

	public static void main(String[] args) {
		int arr[]= {99,55,203,99,4,91};
		Arrays.parallelSort(arr);
		IntStream s=Arrays.stream(arr);
		s.forEach(System.out::println);
		

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
