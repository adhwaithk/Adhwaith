package exam2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class q20 {

	public static void main(String[] args) {
		TreeSet <Integer>n = new TreeSet<Integer>();
		 n.addAll(Arrays.asList(new Integer[] {5,8,-1,9,7,2,3}));
		     
		   
		   
		   System.out.println("enter the element");
		   Scanner sc=new Scanner(System.in);
		   int e=sc.nextInt();
		   TreeSet<Integer>n1=new TreeSet<Integer>();
		   n1=(TreeSet<Integer>)n.subSet(n.first(),e);
		   Iterator i=n1.iterator();
		   while(i.hasNext())
			   System.out.println(i.next()+" ");
	}

}
