package LinkedList;


class DoblyNode
{
	int data;
	DoblyNode next;
	DoblyNode prev;
	
	public DoblyNode(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class DoublyLinkedList {
	
	DoblyNode head;
	int length;
	DoblyNode tail;
	
	public DoblyNode append(int data)
	{
		if(head==null)
		{
			DoblyNode node=new DoblyNode(data);
			head=node;
			tail=head;
		}
		else
		{
			DoblyNode node=new DoblyNode(data);
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		length++;
		return head;
	}

	public DoblyNode prepend(int data)
	{
		if(head==null)
		{
			DoblyNode node=new DoblyNode(data);
			head=node;
			tail=head;
		}
		else
		{
		DoblyNode node=new DoblyNode(data);
		node.next=head;
		head.prev=node; 
		head=node;
		}
		length++;
		return head;
	}
	
	public DoblyNode insert(int data,int loc)
	{
		if(loc==0)
		{
			prepend(data);
		}
		else if(loc>=length)
		{
			append(data);
		}
		else
		{
			DoblyNode n=head;
			for(int i=0;i<loc-1;i++)
			{
				n=n.next;
			}
			DoblyNode node=new DoblyNode(data);
			node.prev=n;
			node.next=n.next;
			n.next.prev=node;
			n.next=node;
			length++;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList l=new DoublyLinkedList();
		l.append(5);
		l.append(10);
		l.append(15);
		l.prepend(-10);
		l.insert(500, 2);
		l.insert(300, 4);
		System.out.println(l.length);
		System.out.println(l.head.data+" "+l.head.next.data+" "+l.tail.prev.data);
		System.out.println(l.head.next.next.next.next.data);
	}

}
