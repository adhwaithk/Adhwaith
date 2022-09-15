package class2;

import java.util.*;


class parent{
	private void p()
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

public class class2 {

	public static void main(String[] args) {
		child g =new child();
		parent f = new parent();
		g.c();

	}

}
