package class11;
class degree{
	public void getdegree() {
	System.out.println("i got a degree");
}
}
class undergraduate extends degree{
	public void getdegree() {
		System.out.println("i am an undergraduate");
			}
}
class postgraduate extends degree{
	public void getdegree() {
		System.out.println("i am an postgraduate");
			}
}
public class class11 {

	public static void main(String[] args) {
		undergraduate a = new undergraduate();
		postgraduate b = new postgraduate();
		a.getdegree();
		b.getdegree();
		
	}
}


