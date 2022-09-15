package sm;
import java.util.*;

public class sm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a =sc.nextInt();
		System.out.println("enter next number");
		int b  = sc.nextInt();
		System.out.println("enter next");
		int c = sc.nextInt();
		if(a<b && a<c)
			System.out.println(a);
		else if(b<c)
			System.out.println(b);
		else
			System.out.println(c);
		
		

	}

}
