package stream;

public class Strudent {
	
	int roll;
	int marks;
	String name;
	
	public Strudent(int roll,int marks,String name) {
		// TODO Auto-generated constructor stub
		this.roll=roll;
		this.marks=marks;
		this.name=name;
	}
	
	int getMarks()
	{
		return marks;
	}
	String getName()
	{
		return name;
	}
	int getRoll()
	{
		return roll;
	}
}
