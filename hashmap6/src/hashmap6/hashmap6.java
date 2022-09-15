package hashmap6;
import java.util.*;

public class hashmap6 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "black");
		hm.put(4, "yellow");
		hm.put(5, "blue");
		hm.put(6, "brown");
		System.out.println("hm: "+hm);
		HashMap<Integer,String>hm1=new HashMap<Integer,String>();
		hm1=(HashMap)hm.clone();
		System.out.println("cloned map: "+hm1);
		
		

	}

}
