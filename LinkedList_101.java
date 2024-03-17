public class Linklistvis {
	
	public static class Node{
		
		int data;
		Node next;
	    public Node(int data)
		 {
			 this.data=data;
			 next=null;

		 }
	}
	
	private static Node head;
		
public static void addfirst(int data)
	{
	    Node current=head;
		head=new Node(data);
		head.next=current;
		
	}
	
	public void display() {
		
		//Node temp=n;
		while(head!=null) {
			
			System.out.println(" "+head.data);
			head=head.next;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Linkedlist");
		head=new Node(5);
		Node n2=new Node(10);
		Node n3=new Node(15);
		Node n4=new Node(20);
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		Linklistvis link=new Linklistvis();
		link.addfirst(35);
		link.display();
		


		
	}
}
