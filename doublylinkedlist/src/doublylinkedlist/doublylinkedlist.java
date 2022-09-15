package doublylinkedlist;

public class doublylinkedlist {
	class node{
		int data;
		node previous;
		node next;
		public node(int data) {
			this.data=data;
		}
	}
	node head,tail=null;
	public void addatstart(int data) {
		node newnode=new node(data);
		if(head==null) {
			head=tail=newnode;
			head.previous=null;
			tail.next=null;
		}
		else {
			head.previous=newnode;
			newnode.next=head;
			newnode.previous=null;
			head=newnode;
		}
	}
	public void display() {
		node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("adding to start");
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
			
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		doublylinkedlist l=new doublylinkedlist();
		l.addatstart(1);
		l.display();
		l.addatstart(2);
		l.display();
		l.addatstart(3);
		l.display();
		l.addatstart(4);
		l.display();
		
		

	}

}
