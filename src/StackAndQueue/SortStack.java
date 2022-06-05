package StackAndQueue;

import java.util.Iterator;
import java.util.Stack;

public class SortStack {
	
	Stack<Integer> s1,s2;
	
	public SortStack()
	{
		s1=new Stack<>();
		s2=new Stack<>();
	}

	public void sort(Stack<Integer> s1,Stack<Integer> s2)
	{
		while(!s1.empty()) {
			int tmp=s1.pop();
			while(!s2.empty() && s2.peek()<tmp)
			{
				s1.push(s2.pop());
			}
			s2.push(tmp);
			
		}
	}
	public static void main(String[] args) {
		
		SortStack s=new SortStack();
		s.s1.push(2);
		s.s1.push(4);
		s.s1.push(1);
		s.s1.push(10);
		s.s1.push(8);
		s.sort(s.s1, s.s2);
//		Iterator<Integer> itr= s.s2.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		while(s.s2.size()!=0)
		{
			System.out.println(s.s2.pop());
		}

	}

}
