package threadrunnainter;
class multi implements Runnable{
	public void run() {
		System.out.println("thread is running");
	}
	
}

public class threadrunnainter {

	public static void main(String[] args) {
		multi g1=new multi();
		Thread t1=new Thread(g1);
		t1.start();
		

	}

}
