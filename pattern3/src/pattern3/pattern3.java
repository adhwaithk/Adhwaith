package pattern3;

public class pattern3 {

	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<3;j++)
			{
				System.out.print(c++);
			}
			c--;
			if(c==4)
			{
				System.out.println();
				System.out.print(c);
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		

	}

}
