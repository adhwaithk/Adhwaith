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

