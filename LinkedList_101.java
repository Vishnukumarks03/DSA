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

	public void display(Node n) {
		
		Node temp=n;
		while(temp!=null) {
			
			System.out.println(" "+temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Linkedlist");
		Node n1=new Node(5);
		Node n2=new Node(10);
		Node n3=new Node(15);
		Node n4=new Node(20);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		Linklistvis link=new Linklistvis();
		link.display(n1);
		
	}
}

