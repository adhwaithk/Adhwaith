package customexc;
class myexception extends Exception{
	public myexception(String s) {
		super(s);
	}
	
}

public class customexc {

	public static void main(String[] args) {
		try {
			throw new myexception("hello");
		}catch(myexception e) {
			System.out.println("custom exception");
			System.out.println(e.getMessage());
		}
		System.out.println("run remaining code");
		

	}

}
