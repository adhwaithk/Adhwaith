package linearsearch2;

import java.util.Scanner;

public class linearsearch2 {

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
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(str)) {
				System.out.println("index "+ i);
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("item not in list");
		}
		
		

	}

}
