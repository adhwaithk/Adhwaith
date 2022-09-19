package javafeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interter {

	public static void main(String[] args) {
		List<String>laplist=new ArrayList();
		laplist.add("Dell");
		laplist.add("Acer");
		laplist.add("HCL");
		laplist.sort((p1, p2)->p1.compareTo(p2));
		laplist.forEach(a->{
			System.out.println(a);
		});

	}

}
