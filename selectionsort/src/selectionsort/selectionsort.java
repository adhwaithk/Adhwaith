package selectionsort;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("original array: ");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
					
				}
			}
			int smallnum=arr[index];
			arr[index]=arr[i];
			arr[i]=smallnum;
		}
		System.out.println("sorted array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		

	}

}
