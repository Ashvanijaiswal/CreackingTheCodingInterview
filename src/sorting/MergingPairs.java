package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MergingPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pair> l=new ArrayList<>(); 
		l.add(new Pair(0,0));
		l.add(new Pair(7,9));
		l.add(new Pair(6,10));
		l.add(new Pair(4,5));
		l.add(new Pair(1,3));
		l.add(new Pair(2,4));
		l.add(new Pair(8,16));
		l.add(new Pair(5,8));
		Collections.sort(l, (p1,p2)->p1.y-p2.y);
		mergePair(l);

	}

	private static void mergePair(ArrayList<Pair> l) {
		// TODO Auto-generated method stub
		int min=l.get(0).x,max=l.get(0).y;
		
		int res=0;
		l.set(res, new Pair(min,max));
		for(int i=1;i<l.size();i++)
		{
			if(max>=l.get(i).x)
			{
			  max=Math.max(l.get(i).y, max);
			  min=Math.min(l.get(i).x, min);
			  l.set(res, new Pair(min,max));
			}
			else
			{
				min=l.get(i).x;
				max=l.get(i).y;
				res++;
				l.set(res, new Pair(min,max));
			
			}
			
		}
		for(int i=0;i<=res;i++)
		{
			System.out.println(l.get(i).x+" "+l.get(i).y);
		}
		
	
		
	}

}

class Pair
{
	int x;
	int y;
	public Pair(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
