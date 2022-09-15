package singlylinkedlistendin;



public class singlylinkedlistendin {
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
	public void addnodeend(int data) {
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
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
		singlylinkedlistendin sls=new singlylinkedlistendin();
		sls.addnodeend(1);
		sls.display();
		sls.addnodeend(2);
		sls.display();
		sls.addnodeend(3);
		sls.display();
		sls.addnodeend(4);
		sls.display();
		

	}

}
