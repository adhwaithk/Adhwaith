<<<<<<< HEAD
package interfacedraw5cure;
interface drawable{
	void draw();
	static int cube(int x) {
		return(x*x*x);
	}
}
class rectangle implements drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class interfacedraw5cure {

	public static void main(String[] args) {
		drawable d=new rectangle();
		d.draw();
		System.out.println(drawable.cube(3));
		

	}

}
=======
package interfacedraw5cure;
interface drawable{
	void draw();
	static int cube(int x) {
		return(x*x*x);
	}
}
class rectangle implements drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class interfacedraw5cure {

	public static void main(String[] args) {
		drawable d=new rectangle();
		d.draw();
		System.out.println(drawable.cube(3));
		

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
