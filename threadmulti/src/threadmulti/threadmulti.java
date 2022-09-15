package threadmulti;

public class threadmulti extends Thread {
	String task;
	threadmulti(String task)
	{
		this.task=task;
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(task+":"+i);

		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
	}

	public static void main(String[] args) {
		threadmulti t=new threadmulti("cut the ticket");
		threadmulti t1=new threadmulti("show the seat number");
		Thread th1=new Thread(t);
		Thread th2=new Thread(t1);
		th1.start();
		th2.start();
		

	}

}
