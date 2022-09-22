package javafeatures;
import java.util.Random;

public class foreach5 {

	public static void main(String[] args) {
		Random random=new Random();
		random.ints(5,10,100).forEach(System.out::println);
		

	}

}
