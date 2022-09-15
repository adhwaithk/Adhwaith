package primeo;

import java.util.Scanner;

public class primeo {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter num");
		int num = a.nextInt();
		for(int i=2;i<=num;i++) {
			int fl = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					fl++;
					break;
				}
				
			}
			if(fl==0)
				System.out.println(i);
		}

	}

}
