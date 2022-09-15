package arraexob;

public class arraexob {

	public static void main(String[] args) {
		try {
			int data[]=new int[5];
			data[6]=30;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outofbound exception occurs");
		}
		System.out.println("run remaining code");

	}

}
