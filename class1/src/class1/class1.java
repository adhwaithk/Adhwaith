package class1;
import java.util.*;

class parent{
	public void p()
	{
		System.out.println("this is parent class");
	}
	
}
class child extends parent{
	public void c()
	{
		
		System.out.println("this is child class");
	}
	
}



public class class1 {
	

	public static void main(String[] args) {
		child g =new child();
		parent f = new parent();
		g.p();
		g.c();
		f.p();
		}

}
