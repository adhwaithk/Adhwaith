package javafeatures;
import java.util.Random;

public class foreachclass {

	public static void main(String[] args) {
		Random random=new Random();
		random.ints(5,10,100).sorted().forEach(System.out::println);
		

	}

}
