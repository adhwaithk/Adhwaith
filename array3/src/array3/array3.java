package array3;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		int sum=0,product=1;
		Scanner sc=new Scanner(System.in);
		int intarr[]=new int[10];
		for(int i=0;i<10;i++) {
			intarr[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(intarr[i]);
		}
		for(int i:intarr) {
			sum+=i;
			product*=i;
		}
		System.out.println(sum);
		System.out.println(product);

	}

}
