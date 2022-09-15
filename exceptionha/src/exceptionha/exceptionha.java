package exceptionha;

public class exceptionha {

	public static void main(String[] args) {
		try {
			int data=100/0;
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		System.out.println("run remaining code");
		

	}

}
