package interface6string;
interface language{
	void getName(String name);
}

public class interface6string {
	public void getName(String name) {
		System.out.println("team playing: "+name);
	}

	public static void main(String[] args) {
		interface6string obj=new interface6string();
		obj.getName("India vs Australia");
	
		

	}

}
