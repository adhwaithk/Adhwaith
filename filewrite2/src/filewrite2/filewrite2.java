package filewrite2;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite2 {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("adhw.txt");
			obj.write("hello");
			obj.close();
		}catch(IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}

	}

}
