package fib;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int a = sc.nextInt();
		int f=0,s=1,next;
		int i=0;
		while(i<a) {
			if(i<=1)
				next=i;
			else {
				next=f+s;
				f=s;
				s=next;
			}
				
	
		System.out.println(next);
		i++;
		}

	}

}
