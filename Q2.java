class ReverseLinkedList
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node ReverseList(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		node = prev;
		return node;
	}
	
	public void display(Node node)
	{
	while(node !=null)
	{
		System.out.println(node.data+" ");
		node=node.next;
	}
	}
	
	public static void main(String args[])
	{
		ReverseLinkedList r =new ReverseLinkedList();
		r.head = new Node(1);
		r.head.next=new Node(5);
		r.head.next.next= new Node(1);
		r.head.next.next.next= new Node(2);
		r.head.next.next.next.next= new Node(3);
		r.head.next.next.next.next.next= new Node(4);
		r.head.next.next.next.next.next.next= new Node(5);
		System.out.println("Given Linked List"+r.display(head));
		
	}
}