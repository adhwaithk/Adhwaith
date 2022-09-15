package singlylinkedlistabe;


public class singlylinkedlistabe {
	class node{
		int data;
		node next;
	public node(int data) 
	{
		this.data=data;
		this.next=null;
		
	}
}
	public node head=null;
	public node tail=null;
	public void addnodestart(int data) {
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			node temp=head;
			head=newnode;
			head.next=temp;
		}
	}
	public void display() {
		node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("adding nodes to start of singly linked list");
		while(current!=null) {
			System.out.println(current.data+"");
			current=current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		singlylinkedlistabe sls=new singlylinkedlistabe();
		sls.addnodestart(1);
		sls.display();
		sls.addnodestart(2);
		sls.display();
		sls.addnodestart(3);
		sls.display();
		sls.addnodestart(4);
		sls.display();
		
		
		

	}

}
