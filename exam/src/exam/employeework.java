package exam;

import java.util.Scanner;

public class employeework {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age: ");
		int age=sc.nextInt();
		System.out.println("enter sex: ");
		int sex=sc.next().charAt(0);
		System.out.println("Are you married?");
		int married=sc.next().charAt(0);
		if(sex=='f') {
			System.out.println("she will work only in urban areas");
		}
		else {
			System.out.println("invalid credentials");
		}

	}

}
