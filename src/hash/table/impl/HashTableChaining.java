package hash.table.impl;

import java.util.ArrayList;
import java.util.LinkedList;


public class HashTableChaining {

	int bucketSize;
	ArrayList<LinkedList<Integer>> table;
	
	public HashTableChaining(int size)
	{
		this.bucketSize=size;
		table=new ArrayList<LinkedList<Integer>>(bucketSize);
		for(int i=0;i<bucketSize;i++)
		{
			table.add(new LinkedList<Integer>());
		}
	}
	public int hash(int key)
	{
		return key%bucketSize;
	}
	public void insert(int key)
	{
		table.get(hash(key)).add(key);
	}
	public void remove(int key)
	{
		int hashValue=hash(key);
		if(table.get(hashValue).contains(key))
		{
			
			table.get(hashValue).remove((Integer)key);
		}
		
	}
	public boolean search(int key)
	{
		int hashValue=hash(key);
		if(table.get(hashValue).contains(key))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableChaining obj=new HashTableChaining(7);
		obj.insert(70);
		obj.insert(71);
		obj.insert(9);
		obj.insert(56);
		obj.insert(72);
		System.out.println(obj.search(9));
		obj.remove(9);
		System.out.println(obj.search(9));

	}

}
