package hash.table.impl;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;


class Node
{
	String key;
	int value;
//	final int hashCode;
	Node next;
	
	public Node(String key,int value)
	{
		this.key=key;
		this.value=value;
//		this.hashCode=hashCode;
	}
}

public class HashTable {
	
//	Problem: Implement hashTable
	private int size;
	private ArrayList<Node> arr;
	private int numBuckets;
	
	public HashTable(int numBuckets)
	{
		this.size=0;
		this.numBuckets=numBuckets;
		this.arr=new ArrayList<Node>();
		
		for(int i=0;i<numBuckets;i++)
		{
			arr.add(null);
		}
	}
	
	public int size() { return size; }
	
    public boolean isEmpty() { return size() == 0; }
	
	private int hash(String key)
	{
		int hash=0;
		for(int i=0;i<key.length();i++)
		{
			hash=(hash+key.charAt(i)*i)%numBuckets;
		}
		return hash;
	}
	
	
	public void set(String key,int value)
	{
		int loc=hash(key);
		Node head=arr.get(loc);
		
		while(head!=null)
		{
			if(head.key.equals(key) && head.value==value)
			{
				return;
			}
			
			head =head.next;
		}
		
		head=arr.get(loc);
		Node curr=head;
		if(head==null)
		{
			head=new Node(key,value);
			arr.set(loc, head);
		}
		while(curr!=null)
		{
			curr=curr.next;
		}
		
		curr=new Node(key,value);
		arr.set(loc,head);
		System.out.println(arr);
		
		
		
	}
	
	public int get(String key)
	{
		int loc=hash(key);
		Node head=arr.get(loc);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head=head.next;

		}
		return -1;
		
	}
	


	public static void main(String[] args) {
		
		HashTable hs=new HashTable(5);
		hs.set("Grapes", 100);
		hs.set("Apple", 140);
		hs.set("Banana", 70);
		hs.set("Mango", 60);
		int value=hs.get("Grapes");
		System.out.println(value);
		System.out.println(hs.get("Mango"));
		
//		System.out.println(hs.get("Banana"));

	}

}
