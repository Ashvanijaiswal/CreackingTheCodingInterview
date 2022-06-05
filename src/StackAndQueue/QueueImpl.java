package StackAndQueue;

public class QueueImpl {
	
	private static class Node
	{
		int data;
		Node next;
		
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	int length=0;
	Node first;
	Node last;
	
	public int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		return last.data;
	}
	
	public void enqueue(int data)
	{
		Node node=new Node(data);
		if(isEmpty())
		{
			first=node;
			last=first;
			length++;
			return ;
		}
		last.next=node;
		last=node;
		length++;
	}
	
	public int dequeue()
	{
		if(first==null)
		{
			return -1;
		}
		if(first==last)
		{
			last=null;
		}
		length--;
		int value=first.data;
		first=first.next;
		return value;
	}

	private boolean isEmpty() {
		
		return first==null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImpl queue=new QueueImpl();
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(15);
		System.out.println(queue.length);
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.length);
		System.out.println(queue.dequeue());
	}

}
