package quicksort;
import java.util.Scanner;
public class quicksort {
	static void swap1(int a[], int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	static int partition1(int a[],int low,int high)
	{
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				swap1(a,i,j);
			}
		}
		swap1(a,i+1,high);
		return i+1;
	}
	static void quicksort1(int a[],int l,int h)
	{
		if(l<h)
		{
			int pi=partition1(a,l,h);
			quicksort1(a,l,pi-1);
			quicksort1(a,pi+1,h);
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		quicksort1(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
	
		

	}

}
