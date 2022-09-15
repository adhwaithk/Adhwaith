package threadsetprio;

public class threadsetprio extends Thread {
	public void run()
	{
		System.out.println("running");
	}

	public static void main(String[] args) {
		threadsetprio t1=new threadsetprio();
		threadsetprio t2=new threadsetprio();
		t1.setPriority(4);
		t2.setPriority(7);
		System.out.println("priority of thread t1 is "+t1.getPriority());
		System.out.println("priority of thread t2 is "+t2.getPriority());
		t1.start();
		
		
		

	}

}
