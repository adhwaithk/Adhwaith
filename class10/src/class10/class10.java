package class10;
class I{
	int i;
	public void printnum()
	{
		System.out.println(i);
	}
}
class J extends I{
	int j;
	public void printnum()
	{
		System.out.println(j);
	}
}

public class class10 {

	public static void main(String[] args) {
		J a = new J();
		a.i=5;
		a.j=7;
		a.j=a.i;
		a.printnum();
		

	}

}
