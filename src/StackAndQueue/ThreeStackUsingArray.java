package StackAndQueue;

import java.util.EmptyStackException;

public class ThreeStackUsingArray {

	int numOfStack;
	int stackCapacity;
	int size[];
	int values[];
	
	public ThreeStackUsingArray(int numOfStack,int stackCapacity)
	{
		this.numOfStack=numOfStack;
		this.stackCapacity=stackCapacity;
		size=new int[numOfStack+1];
		values=new int[numOfStack*stackCapacity];
	}
	
	public void push(int stackNum,int data) throws FullStackException
	{
		if(isFull(stackNum))
		{
			throw new FullStackException(stackNum);
		}
		size[stackNum]++;
		values[indexOfTop(stackNum)]=data;
	}
	
	private int indexOfTop(int stackNum) {
		
		
		return stackNum*stackCapacity-(stackCapacity-size[stackNum])-1;
	}

	private boolean isFull(int stackNum) {
	    
		return size[stackNum]==stackCapacity;
	}

	public int pop(int stackNum)
	{
		if(isEmpty(stackNum))
		{
			throw new EmptyStackException();
		}
		int popValue=values[indexOfTop(stackNum)];
		values[indexOfTop(stackNum)]=0;
		size[stackNum]--;
		return popValue;
	}
	private boolean isEmpty(int stackNum) {
		// TODO Auto-generated method stub
		return size[stackNum]==0;
	}
	
	public int peek(int stackNum)
	{
		if(isEmpty(stackNum))
		{
			throw new EmptyStackException();
		}
		return values[indexOfTop(stackNum)];
	}

	public static void main(String[] args) throws FullStackException {
		// TODO Auto-generated method stub
		ThreeStackUsingArray stack=new ThreeStackUsingArray(3,3);
		stack.push(1, 2);
		stack.push(2, 5);
		stack.push(3, 3);
		stack.push(1, 4);
		stack.push(1, 6);
		stack.push(3, 6);
		stack.push(1, 8);
		System.out.println(stack.peek(3));
		
		System.out.println(stack.peek(1));
	}

}
