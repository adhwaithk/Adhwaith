package reversestring;

public class reversestring {

	public static void main(String[] args) {
		String str="Hi, how are you";
		String revstr="";
		
		for(int i=str.length()-1;i>=0;--i) {
			
			 revstr += str.charAt(i);
			
		}
		System.out.println(revstr);

	}

}
