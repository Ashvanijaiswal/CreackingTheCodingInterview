package StackAndQueue;


class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class StackImpl {
	 
	 Node top;
	 Node bottom;
	int length;
	
	public StackImpl()
	{
		this.top=null;
		this.bottom=null;
		this.length=0;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		return top.data;
	}
	
	public void push(int data)
	{
		Node node=new Node(data);
		if(isEmpty())
		{
			node.next=top;
			top=node;
			bottom=top;
			length++;
			return;
		}
		node.next=top;
		top=node;
		length++;
	}
	
	public int pop()
	{
		if(this.top==this.bottom)
		{
			bottom=null;
		}
		
		if(!isEmpty())
		{
			int popedValue=top.data;
			top=top.next;
			length--;
			return popedValue;
		}
		
		return -1;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public static void main(String[] args) {
		StackImpl stack=new StackImpl();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		System.out.println(stack.peek());
		System.out.println(stack.length);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.bottom);
	}
}
