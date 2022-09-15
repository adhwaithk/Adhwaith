package numformex;

public class numformex {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt("1a");
		}catch(NumberFormatException e) {
			System.out.println("Number format exception");
		}
		System.out.println("run remaining code");

	}

}
