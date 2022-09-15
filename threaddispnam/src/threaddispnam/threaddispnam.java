package threaddispnam;

public class threaddispnam extends Thread {

	public static void main(String[] args) {
		threaddispnam t1=new threaddispnam();
		t1.setName("thread1");
		t1.start();
		ThreadGroup currentGroup=Thread.currentThread().getThreadGroup();
		int noThreads=currentGroup.activeCount();
		Thread[] lstThread=new Thread[noThreads];
		currentGroup.enumerate(lstThread);
		for(int i=0;i<noThreads;i++)
			System.out.println("thread no:" +i + " = " + lstThread[i].getName());
		
		

	}

}
