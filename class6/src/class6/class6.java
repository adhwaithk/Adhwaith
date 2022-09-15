package class6;
class printnumber{
	public int print(int a)
	{
		System.out.println(a);
		return a;
	}
	public float print(float b)
	{
		System.out.println(b);
		return b;
	}
	public double print(double c)
	{
		System.out.println(c);
		return c;
	}
	public String print(String d)
	{
		System.out.println(d);
		return d;
	}
	
}

public class class6 {

	public static void main(String[] args) {
		printnumber a =new printnumber();
		printnumber b =new printnumber();
		a.print("adhw");
		a.print(10.11);
		a.print(10);
		a.print(0.456);
		

	}

}
