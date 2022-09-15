package class8;
class area{
	public static void parea(int x, int y)
	{
		System.out.println(x*y);
	}
	public static void parea(int x)
	{
		System.out.println(x*x);
	}
	
}

public class class8 {

	public static void main(String[] args) {
		area g = new area();
		g.parea(4,5);
		g.parea(9);

	}

}
