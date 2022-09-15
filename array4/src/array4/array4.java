package array4;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int intarr[]=new int[10];
		for(int i=0;i<10;i++) {
			intarr[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(intarr[i]);
		}
		int smallest = intarr[0];
		int largest = intarr[0];
		for(int i =0;i<10;i++) {
			if(intarr[i]>largest) {
				largest = intarr[i];
			}
			else if(intarr[i]<smallest) {
				smallest=intarr[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(smallest);

	}

}
