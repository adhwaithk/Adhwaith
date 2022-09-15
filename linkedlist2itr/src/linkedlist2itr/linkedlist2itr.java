package linkedlist2itr;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist2itr {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("purple");
		list.add("green");
		list.add("red");
		list.add("blue");
		ListIterator<String> P=list.listIterator(0);
		while(P.hasNext()) {
			System.out.println(P.next());
		}
		

	}

}
