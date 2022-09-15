package large2;
import java.util.Scanner;

public class large2 {

	public static void main(String[] args) {
		
			int numo,numt,largest;
			Scanner scan = new Scanner(System.in);
			System.out.print("enter 1");
			numo = scan.nextInt();
			System.out.print("enter 2");
			numt = scan.nextInt();
			if (numo > numt) {
				System.out.println("num one is largest");
			}
			else {
				System.out.println("num 2 is largest");
			}

		}
}



