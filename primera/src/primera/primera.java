package primera;

public class primera {

	public static void main(String[] args) {
		int i;
		int num=0;
		String primeNumbers ="";
		for(i=1;i<=100;i++)
		{
			int c=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					c=c+1;
				}
			}
			if(c==2)
			{
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.println(primeNumbers);

	}

}
