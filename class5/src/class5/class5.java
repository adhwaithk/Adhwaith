package class5;
class shape{
	public void shape() {
		System.out.println("this is shape");
	}
}
class rect extends shape{
	public void rect() {
		System.out.println("this is rectangular shape ");
	}
}
class circle extends shape{
	public void circle() {
		System.out.println("this is circular shape");
		
	}
}
class square extends rect{
	public void square() {
		System.out.println("square is a rectangle");
	}
}

public class class5 {

	public static void main(String[] args) {
		square sq=new square();
		sq.shape();
		sq.rect();
		

	}

}
