package singlelinkedlist;

public class singlelinkedlist {
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
	public void addnode(int data) {
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
		System.out.println("nodes of singly linked list");
		while(current!=null) {
			System.out.println(current.data+"");
			current=current.next;
		}
		System.out.println();
	}
	
	
	

	public static void main(String[] args) {
		singlelinkedlist sl=new singlelinkedlist();
		sl.addnode(1);
		sl.addnode(2);
		sl.addnode(3);
		sl.addnode(4);
		sl.display();

		}
		
		



}
