package threadprodcons;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class threadprodcons {

	public static void main(String[] args) {
				BlockingQueue<Integer> sharedq=new LinkedBlockingQueue<Integer>();
				producer p=new producer(sharedq);
				consumer c=new consumer(sharedq);
				p.start();
				c.start();
		

	}

}
class producer extends Thread{
	private BlockingQueue<Integer>sharedq;
	public producer(BlockingQueue<Integer> aqueue) {
		super("producer");
		this.sharedq=aqueue;
	}
	public void run() {
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println(getName()+" PRODUCED " + i);
				sharedq.put(i);
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class consumer extends Thread{
	private BlockingQueue<Integer>sharedq;
	public consumer(BlockingQueue<Integer> aqueue) {
		super("consumer");
		this.sharedq=aqueue;
	}
	public void run() {
		try {
			while(true) {
				Integer item=sharedq.take();
				System.out.println(getName()+" PRODUCED " + item);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
