package binarysearch2;

import java.util.Scanner;

public class binarysearch2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[5];
		for(int i=0;i<5;i++) {
				arr[i]=sc.nextLine();
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		
	}
		Scanner scan = new Scanner(System.in);
		System.out.print("enter name");
		String str= sc.nextLine();
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(arr[mi].equals(str)) {
				System.out.println("index "+mi);
				break;
				
			}
			else if(arr[mi].compareTo(str)<0) {
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
