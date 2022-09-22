package synchronizedblock;
class table
{
	void printtable(int n)
	{
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
					
				}
			}
		}
	}
}
class mythread extends Thread{
	table t;
	mythread(table t){
		this.t=t;
	}
	public void run() {
		t.printtable(5);
	}
}
class mythread1 extends Thread{
	table t;
	mythread1(table t){
		this.t=t;
	}
	public void run() {
		t.printtable(100);
	}
}

public class synchronizedblock {

	public static void main(String[] args) {
		table obj=new table();
		mythread t1=new mythread(obj);
		mythread1 t2=new mythread1(obj);
		t1.start();
		t2.start();
		

	}

}
