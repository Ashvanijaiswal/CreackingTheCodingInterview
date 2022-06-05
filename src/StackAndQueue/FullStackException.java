package StackAndQueue;

public class FullStackException extends Exception {

	String s="stack is full!";
	
	public FullStackException(int stackNum)
	{
		s=stackNum+" "+this.s;
	}
	public String toString()
	{
		return s;
	}
}
