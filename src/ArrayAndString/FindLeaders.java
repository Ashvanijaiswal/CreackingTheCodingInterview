package ArrayAndString;

import java.util.ArrayList;
import java.util.Collections;

public class FindLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLeader(new int[]{7,10,4,10,6,5,2});

	}

	private static void findLeader(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int curMax=arr[n-1];
		ArrayList<Integer> l=new ArrayList<>();
	    l.add(curMax);
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>curMax)
			{
				curMax=arr[i];
				l.add(curMax);
			}
		}
		Collections.reverse(l);
		System.out.println(l);
		
	}

}
