package nullexc1;

public class nullexc1 {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.substring(28));
		}catch(NullPointerException e) {
			System.out.println("Null pointer exception");
		}
		System.out.println("run remaining code");
		

	}

}
