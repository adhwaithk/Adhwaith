package class4;
class rect{
	int le;
	int br;
	public rect(int l,int b) {
		le=l;
		br=b;
		
	}
	public void area() {
		System.out.println(le*br);
	}
	public void peri() {
		System.out.println(2*(le+br));
	}
}

public class class4 {

	public static void main(String[] args) {
		rect r = new rect(5,6);
		r.area();
		r.peri();

	}

}
