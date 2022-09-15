package stringindexexob;

public class stringindexexob {

	public static void main(String[] args) {
		try {
			String str="how are you";
			System.out.println(str.substring(28));
			}catch(StringIndexOutOfBoundsException e){
				System.out.println("string out of bound exception occurs");
				
			}
		System.out.println("run remaining code");
		

	}

}
