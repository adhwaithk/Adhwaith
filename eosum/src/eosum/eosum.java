package eosum;
import java.util.*;

public class eosum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sume=0,sumo=0,rem;
		System.out.println("enter your number");
		int num=sc.nextInt();
		n=num;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				sume=sume+rem;
			}
			else
			{
				sumo=sumo+rem;
			}
			num=num/10;
		}

		System.out.println(sume);
		System.out.println(sumo);
	}

}
