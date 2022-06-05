package StackAndQueue;

import java.util.LinkedList;

abstract class Animal
{
	private int order;
	protected String name;
	public Animal(String n) {
		name =n;
	}
	public void setOrder(int ord)
	{
		order=ord;
	}
	public int getOrder()
	{
		return order;
	}
	
	public boolean isOlderThan(Animal a)
	{
		return this.order<a.order;
	}
}

class Dog extends Animal
{
	public Dog(String n)
	{
		super(n);
	}
}
class Cat extends Animal
{
	public Cat(String n)
	{
		super(n);
	}
}

public class AnimalSheltar {

	LinkedList<Dog> dog=new LinkedList<>();
	LinkedList<Cat> cat=new LinkedList<>();
	private int order=0;
	public void enqueue(Animal a)
	{
		a.setOrder(order);
		order++;
		if(a instanceof Dog) {
			dog.addLast((Dog)a);
		}
		else if(a instanceof Cat)
		{
			cat.addLast((Cat)a);
		}
	}
	
	public Animal dequeueAny()
	{
		if(dog.size()==0)
		{
			return cat.pop();
		}
		else if(cat.size()==0)
		{
			return dog.poll();
		}
		Dog a=dog.peek();
		Cat c=cat.peek();
		if(a.isOlderThan(c))
		{
			return dog.poll();
		}
		else
		{
			return cat.poll();
		}
	}
	
	public Dog dequeueDog()
	{
		return dog.poll();
	}
	public Cat dequeueCat()
	{
		return cat.poll();
	}
	
	public static void main(String[] args) {
		
		AnimalSheltar ob=new AnimalSheltar();
		ob.enqueue(new Dog("dog1"));
		ob.enqueue(new Dog("dog2"));
		ob.enqueue(new Cat("cat1"));
		ob.enqueue(new Cat("cat2"));
		System.out.println(ob.dequeueCat().name);
	}
}
