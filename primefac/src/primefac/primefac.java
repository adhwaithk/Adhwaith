package primefac;

import java.util.Scanner;

public class primefac {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter number");
		int num = a.nextInt();
		for(int i=2;i<num;i++)
		{
			while(num%i==0) {
				System.out.println(i+" ");
				num=num/i;
			}
		}
		if(num>2) {
			System.out.println(num);
		}

	}

}
