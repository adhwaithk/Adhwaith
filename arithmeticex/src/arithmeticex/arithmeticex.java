package arithmeticex;

public class arithmeticex {

	public static void main(String[] args) {
		try {
			int data=30/0;
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		System.out.println("run remaining code");

	}

}
