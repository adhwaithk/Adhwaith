package threadctrl;
class thread1 extends Thread
{
	String msg="";
	thread1(String msg)
	{
		this.msg=msg;
		
	}
	public void run()
	{
		try {
			while(true)
			{
				System.out.println(msg);
				Thread.sleep(300);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
class thread2 extends Thread
{
	String msg="";
	thread2(String msg)
	{
		this.msg=msg;
		
	}
	public void run()
	{
		try {
			while(true)
			{
				System.out.println(msg);
				Thread.sleep(400);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}


public class threadctrl {

	public static void main(String[] args) {
		thread1 t1=new thread1("running thread1");
		t1.start();
		thread1 t2=new thread1("running thread1");
		t2.start();
		
		

	}

}
