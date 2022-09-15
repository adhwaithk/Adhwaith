package class9;
abstract class bank{
	abstract void getbalance();
}
class banka extends bank{
	void getbalance() {
		System.out.println("money deposited in bank a is $1000");
	}
}
class bankb extends bank{
	void getbalance() {
		System.out.println("money deposited in bank a is $1500");
	}
}
class bankc extends bank{
	void getbalance() {
		System.out.println("money deposited in bank a is $2000");
	}
}

public class class9 {

	public static void main(String[] args) {
		bank a =new banka();
		a.getbalance();
		bank b=new bankb();
		b.getbalance();
		bank c=new bankc();
		c.getbalance();

	}

}
