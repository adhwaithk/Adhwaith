package readfile;
import java.io.*;
import java.util.Scanner;


public class readfile {

	public static void main(String[] args) {
		try {
			File obj=new File("adh.txt");
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
				System.out.println(data);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
