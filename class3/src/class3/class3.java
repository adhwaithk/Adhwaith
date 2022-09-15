package class3;
class member{
	String name;
	int age;
	String phonen;
	String address;
	int	salary;
	public void salary() {
		System.out.println(salary);
	}
}
class manager extends member{
	String department;
	
	
}
class employee extends member{
	String specialization;
	
	
}
	

public class class3 {

	public static void main(String[] args) {
		employee e = new employee();
		e.name="Abhi";
		System.out.println(e.name);
		e.age=28;
		System.out.println(e.age);
		e.phonen="9846572838";
		System.out.println(e.phonen);
		e.address="sundar house,feroke,pin:675556,kozhikode";
		System.out.println(e.address);
		e.salary=25000;
		System.out.println(e.salary);
		manager m = new manager();
		m.name="Ashil";
		System.out.println(m.name);
		m.age=42;
		System.out.println(m.age);
		m.phonen="9846572456";
		System.out.println(m.phonen);
		m.address="sundar house,feroke,pin:675556,kozhikode";
		System.out.println(m.address);
		m.salary=250000;
		System.out.println(m.salary);
		}

}
