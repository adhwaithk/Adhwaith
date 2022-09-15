package marks;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = a.nextInt();
		if(marks>=75) {
			System.out.println("honours");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("first class");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("second class");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("third class");
		}
		else
			System.out.println("failed");
		

	}

}
