//Author: CS Dojo

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

    static int countNodes(Node head){
        int count = 1;
        Node current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
}