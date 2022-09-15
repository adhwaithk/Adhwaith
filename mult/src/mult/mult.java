package mult;

import java.util.Scanner;

public class mult {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter num");
		int num = a.nextInt();
		if(num==24) {
			for(int i=1;i<=10;++i)
			{
				System.out.printf("%d * %d = %d \n",num,i,num*i);
			}
			
		}
		else if(num==50) {
			for(int i=1;i<=10;++i)
			{
				System.out.printf("%d * %d = %d \n",num,i,num*i);
			}
		}
		else if(num==29) {
			for(int i=1;i<=10;++i)
			{
				System.out.printf("%d * %d = %d \n",num,i,num*i);
			}
		}
		else
			System.out.println("invalid");



	}

}
