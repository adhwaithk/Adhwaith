package binarysearch;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		int intarr[]=new int[5];
		for(int i=0;i<5;i++) {
			intarr[i]=sc.nextInt();
			
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("enter item");
		num = scan.nextInt();
		int li=0;
		int hi=intarr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(intarr[mi]==num) {
				System.out.println("index "+mi);
				break;
				
			}
			else if(intarr[mi]<num) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("not found");
		}
		

	}

}
