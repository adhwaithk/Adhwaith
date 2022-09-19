package interface4bank;
interface bank{
	float roi();
}
class sbi implements bank{
	public float roi() {
		return 9.15f;
	}
}
class pnb implements bank{
	public float roi() {
		return 9.7f;
	}
}

public class interface4bank {

	public static void main(String[] args) {
		bank b=new sbi();
		System.out.println("roi:"+b.roi());

	}

}
