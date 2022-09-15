package hashmap1;
import java.util.*;

public class hashmap1 {

	public static void main(String[] args) {
		int a,b,c;
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String str1=sc.next();
		String str2=sc.next();
		Scanner sc1 = new Scanner(System.in);
		a =sc1.nextInt();
		b =sc1.nextInt();
		c =sc1.nextInt();
		hm.put(a, str);
		hm.put(b, str1);
		hm.put(c, str2);
		for(Map.Entry x:hm.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		

	}

}
