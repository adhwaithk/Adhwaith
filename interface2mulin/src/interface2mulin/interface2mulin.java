package interface2mulin;
interface printable{
	void print();
}
interface showable{
	void show();
}
class a7 implements printable,showable{
	public void print() {System.out.println("hello");}
	public void show() {System.out.println("welcome");}}
	


public  class interface2mulin {

	public static void main(String[] args) {
		a7 obj=new a7();
		obj.print();
		obj.show();
		

	}

}


