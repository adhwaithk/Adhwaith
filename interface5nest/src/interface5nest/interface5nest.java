<<<<<<< HEAD
package interface5nest;
interface showable{
	void show();
	interface message{
		void msg();
	}
}
class tesnexint implements showable.message{
	public void msg() {
		System.out.println("hello nested interface");
	}
}


public class interface5nest {

	public static void main(String[] args) {
		showable.message message=new tesnexint();
		message.msg();
		

	}

}

=======
package interface5nest;
interface showable{
	void show();
	interface message{
		void msg();
	}
}
class tesnexint implements showable.message{
	public void msg() {
		System.out.println("hello nested interface");
	}
}


public class interface5nest {

	public static void main(String[] args) {
		showable.message message=new tesnexint();
		message.msg();
		

	}

}

>>>>>>> ad496f27f395f5932f9e6cec6d7ceaef4b9e576b
