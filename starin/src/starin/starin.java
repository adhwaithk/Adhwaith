package starin;
import java.util.*;
public class starin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		int n=sc.nextInt();
		int i=n,j;
		while(i>0)
		{
			j=0;
			while(j++<i)
			{
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
		
		
	}

}
