package linkedlist1end;
import java.util.*;

public class linkedlist1end {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("red");
		list.add("blue");
		list.add("purple");
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		list.add(str);
		System.out.println(list);
		

	}

}
