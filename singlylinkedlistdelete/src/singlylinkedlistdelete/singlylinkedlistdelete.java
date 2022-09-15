package singlylinkedlistdelete;


public class singlylinkedlistdelete {
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
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void deletestart() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		else {
			if(head!=tail) {
				head=head.next;
			}
			else {
				head=tail=null;
			}
		}
	}
	public void display() {
		node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		while(current!=null) {
			System.out.println(current.data+"");
			current=current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		singlylinkedlistdelete sl=new singlylinkedlistdelete();
		sl.addnodestart(1);
		sl.addnodestart(2);
		sl.addnodestart(3);
		sl.addnodestart(4);
		System.out.println("original list: ");
		sl.display();
		while(sl.head!=null) {
			sl.deletestart();
			System.out.println("updated list: ");
			sl.display();
			
		}
		

	}

}
