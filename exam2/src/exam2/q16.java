package exam2;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class q16 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
	      hashSet.add("red");
	      hashSet.add("blue");
	      hashSet.add("white");
	      hashSet.add("grey");
	      hashSet.add("brown");
	      hashSet.add("black");
	      hashSet.add("green");
	      hashSet.add("yellow");
	      System.out.println("HashSet = "+ hashSet);
	      Set<String> set = new TreeSet<String>(hashSet);
	      System.out.println("TreeSet = "+set);

	}

}
