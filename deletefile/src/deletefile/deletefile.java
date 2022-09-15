package deletefile;
import java.io.File;

public class deletefile {

	public static void main(String[] args) {
		File obj = new File("adhw.txt");
		if(obj.delete()) {
			System.out.println("file deleted " + obj.getName());
		}
		else {
			System.out.println("failed to delete");
		}
		

	}

}
