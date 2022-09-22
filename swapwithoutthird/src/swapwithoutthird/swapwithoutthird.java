package swapwithoutthird;

public class swapwithoutthird {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println("a is "+a+" b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a is "+a+" b is "+b);
		

	}

}
