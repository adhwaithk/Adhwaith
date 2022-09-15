package vowel1;

import java.util.Scanner;

public class vowel1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int ch = sc.nextInt();
		switch(ch) {
			case 1:
				System.out.println("a");
				break;
			case 2:
				System.out.println("e");
				break;
			case 3:
				System.out.println("i");
				break;
			case 4:
				System.out.println("u");
				break;
			default:
				System.out.println("invalid");
				break;

	}

}
}