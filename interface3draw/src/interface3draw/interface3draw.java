<<<<<<< HEAD
package interface3draw;
interface drawable{
	void draw();
}
class rectangle implements drawable{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle implements drawable{
	public void draw()
	{
		System.out.println("drawing circle");
	}
}

public class interface3draw {

	public static void main(String[] args) {
		drawable d=new circle();
		d.draw();
		

	}

}
=======
package interface3draw;
interface drawable{
	void draw();
}
class rectangle implements drawable{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle implements drawable{
	public void draw()
	{
		System.out.println("drawing circle");
	}
}

public class interface3draw {

	public static void main(String[] args) {
		drawable d=new circle();
		d.draw();
		

	}

}
>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
