

	class Node {
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	
	
    public static void main(String[] args) {
        Node nodeA = new Node(6);
        Node nodeB = new Node(5);
        Node nodeC = new Node(5);
        Node nodeD = new Node(5);
        Node nodeE = new Node(5);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println(countNodes(nodeA));
    }

  //count the nodes  
    
    static int countNodes(Node head){
        int count = 1;
        Node current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
 /* Linked List Insertion
    Search an element in a Linked List (Iterative and Recursive)
    Find Length of a Linked List (Iterative and Recursive)
    Reverse a linked list
    Linked List Deletion (Deleting a given key)
    Linked List Deletion (Deleting a key at given position)
    Write a function to delete a Linked List
    Write a function to get Nth node in a Linked List
    Nth node from the end of a Linked List 
  */ 
    
}