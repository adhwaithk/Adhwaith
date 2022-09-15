package ioexc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;


public class ioexc {

	public static void main(String[] args) {
		try {
			File ob = new File("adhwa.txt");
			FileInputStream f1=new FileInputStream(ob);
			System.out.println(f1.read());
		}catch(IOException e) {
			System.out.println("ioexception");
		}
		System.out.println("run remaining code");
		

	}

}
