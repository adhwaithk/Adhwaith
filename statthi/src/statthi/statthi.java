package statthi;
class player{
	int num;
	String name;
	static String team="India";
	player(int r,String n){
		this.num=r;
		this.name=n;
		
	}
	public void display() {
		System.out.println(num+" "+name+" "+team);
	}
}

public class statthi {

	public static void main(String[] args) {
		player p1=new player(10,"Sachin Tendulkar");
		p1.display();
		player p2=new player(45,"Rohit Sharma");
		p2.display();
		
		

	}

}
