package bubblesort;

import java.util.Scanner;

public class bubblesort {
	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("original array: ");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
			}
		}
		System.out.println("sorted array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
			
		}

}
}
