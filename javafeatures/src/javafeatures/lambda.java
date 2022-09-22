package javafeatures;
import java.util.*;

public class lambda {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("pear");
		fruits.add("mango");
		fruits.forEach(str->System.out.println(str));
		

	}

}
