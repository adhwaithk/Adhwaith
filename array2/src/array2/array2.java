package array2;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int found = 0;
		Scanner sc=new Scanner(System.in);
		int intarr[]=new int[10];
		for(int i=0;i<10;i++) {
			intarr[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(intarr[i]);
		}
		System.out.println("enter element to be searched");
		int sea = sc.nextInt();
		for(int i=0;i<10;i++) {
			if(intarr[i]==sea) {
				
				 found = 1;
				 break;
			}
		}
		
		if(found ==0) {
			System.out.println("number is not present");
				
		}
		else {
			System.out.println("number is present");
		
	}
}
}
		
		
