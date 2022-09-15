package mucaexce;

public class mucaexce {

	public static void main(String[] args) {
		try {
			int data[]=new int[5];
			data[5]=30/0;
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception occurs");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outofbound exception occurs");
		}
		System.out.println("run remaining code");

	}

}
