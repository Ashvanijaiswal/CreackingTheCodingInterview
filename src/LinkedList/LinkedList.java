package LinkedList;


public class LinkedList {

//	Implement LinkedList
//	5-->10-->15
	LinkedList head=null;
	LinkedList next=null;
	int data;
	int length;
	LinkedList tail=null;
	
	
	public LinkedList(int data)
	{
		this.head=this;
		this.data=data;
		this.tail=head;
		this.length=1;
	
		
	}
	
	public LinkedList()
	{
		this.head=this;
		this.tail=head;
		this.length=1;
	}
	
	public LinkedList appendToTail(int data)
	{
		LinkedList newNode=new LinkedList(data);
		this.tail.next=newNode;
		tail=newNode;
		this.length++;
		return this;
		
	}
	
	public LinkedList prepend(int data)
	{
		
		LinkedList newNode=new LinkedList(data);
		newNode.next=this.head;
		this.head=newNode;
		
		this.length++;
		
		return this;
	}
	
	public LinkedList insert(int index,int data)
	{
		if(index==0)
		{
			return prepend(data);
		}
		else if(index>=this.length)
		{
			return appendToTail(data);
		}
		LinkedList pre=this.head;
		for(int i=0;i<index-1;i++)
		{
			
			pre=pre.next;
		}
		LinkedList node=new LinkedList(data);
		node.next=pre.next;
		pre.next=node;
		this.length++;
		return this;
	}
	
	public LinkedList delete(int index)
	{
		if(index==0)
		{
			this.head=this.head.next;
		}
		LinkedList pre=this.head;
		for(int i=0;i<index-1;i++)
		{
			pre=pre.next;
		}
		pre.next=pre.next.next;
		this.length--;
		return this;
	}
	
	public void printList()
	{
		LinkedList node=this.head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	
	
	public  static LinkedList addList(LinkedList l, LinkedList l2,int carry)
	{
		if(l==null &&  l2==null && carry==0)
		{
			return null;
		}
		LinkedList result=new LinkedList();
		int value=carry;
		if(l!=null)
		{
			value+=l.data;
		}
		if(l2!=null)
		{
			value+=l2.data;
		}
		result.data=value%10;
		
		if(l!=null || l2!=null)
		{
			LinkedList more=addList(l==null?null:l.head.next,l2==null?null:l2.head.next,value>=10?1:0);
			result.tail.next=more;
			
		}
		return result;
		
	}
	
	public static LinkedList linkedListSum(LinkedList l, LinkedList l2) {
		// TODO Auto-generated method stub
		if(l==null || l2==null)
		{
			return null;
		}
		LinkedList node1=l.head;
		LinkedList node2=l2.head;
		int data=node1.data+node2.data;
		int carry=data/10;
		int rem=data%10;
		LinkedList l3=new LinkedList(rem);
		node1=node1.next;
		node2=node2.next;
		do {
			data=node1.data+node2.data+carry;
			rem=data%10;
			carry=data/10;
			l3.appendToTail(rem);
			node1=node1.next;
			node2=node2.next;
		}
		while(node1!=null && node2!=null);
		
		while(node1!=null)
		{
			l3.appendToTail(node1.data+carry);
			node1=node1.next;
		}
		while(node2!=null)
		{
			l3.appendToTail(node2.data+carry);
			node2=node2.next;
		}
		return l3;
	}
	
	public static void  main(String [] args) {
		// TODO Auto-generated  method stub

		LinkedList l=new LinkedList(7);
		l.appendToTail(1);
		l.appendToTail(9);
		l.printList();
		LinkedList l2=new LinkedList(5);
		l2.appendToTail(9);
		l2.appendToTail(2);
		l2.appendToTail(7);
		l2.printList();
		LinkedList l3=addList(l,l2,0);
		l3.printList();
	
	}

	
	
}

