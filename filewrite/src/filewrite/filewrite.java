package filewrite;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("adh.txt");
			System.out.println("writen to file");
			obj.write("hi,how are you");
			obj.close();
		}catch(IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		

	}

}
