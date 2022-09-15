package linearsearch1;

import java.util.Scanner;

public class linearsearch1 {

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
		int temp=0;
		for(int i=0;i<intarr.length;i++) {
			if(intarr[i]==num) {
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
