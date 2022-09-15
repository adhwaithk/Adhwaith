package average;
import java.util.*;

public class average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,s=0,a=0;
		System.out.println("enter 10 numbers");
		for(i=1;i<=10;i++)
		{
			n=sc.nextInt();
			s=s+n;
			a=s/10;	
		}
		System.out.println(a);

	}

}
