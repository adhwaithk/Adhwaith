
import java.util.Scanner;
public class HELLO {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter age");
		int age = a.nextInt();
		if (age >= 18) {
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("you are not eligible for voting");
		}
		

	}

}
