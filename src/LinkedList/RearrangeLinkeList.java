package LinkedList;

//Problem : a1-a2-a3---an-b1-b2-b3---bn
//to a1-b1-a2-b2-a3-b3---an-bn
class Node
{
	String data;
	Node next;
	
	public Node(String data)
	{
		this.data=data;
		this.next=null;
	}
}
public class RearrangeLinkeList {
	
	Node head;
	Node tail;
	int length;
	
	public void append(String data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			tail=head;
			return;
		}
		tail.next=node;
		tail=node;
		
	}
	
	public RearrangeLinkeList arrange()
	{
		Node s=this.head;
		Node f=this.head;
		Node p=this.head;
		while(f.next.next!=null)
		{
			s=s.next;
			f=f.next.next;
		}
		f=f.next;
		
		return this;
	}
	
	public void printList()
	{
		Node node=this.head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}

	public RearrangeLinkeList reverse()
	{
		Node prev,curr,next;
		curr=this.head;
		prev=this.head;
		this.tail=this.head;
		next=curr.next;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		this.head.next=null;
		this.head=prev;
		return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RearrangeLinkeList list=new RearrangeLinkeList();
		list.append("a1");
		list.append("a2");
		list.append("a3");
		list.append("b1");
		list.append("b2");
		list.append("b3");
		System.out.println(list.head.data+" "+list.head.next.data+" "+list.tail.data);
		list.printList();
		list.reverse();
		System.out.println(list.head.data+" "+list.head.next.data+" "+list.tail.data);
		list.printList();
		

	}

}
