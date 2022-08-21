package HashingAlgorithm;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctElementInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{10,20,20,10,30,40,10};
		int k=4;
		findDistinct(arr,k);
		
	}

	private static void findDistinct(int[] arr,int k) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<k;i++)
		{
			if(hm.containsKey(arr[i]))
			hm.put(arr[i], hm.get(arr[i])+1);
			else
			{
				hm.put(arr[i],1);
			}
		}
//		20,20,10,30
		System.out.print(hm.keySet().size()+" ");
		for(int i=1;i<arr.length-k+1;i++)
		{
			if(hm.get(arr[i-1])>1)
			hm.put(arr[i-1], hm.get(arr[i-1])-1);
			else
			{
				hm.remove(arr[i-1]);
			}
			if(hm.containsKey(arr[k-1+i]))
			{
				hm.put(arr[k-1+i], hm.get(arr[k-1+i])+1);
			}
			else
			hm.put(arr[k-1+i], 1);
			
			System.out.print(hm.keySet().size()+" ");
			
		}
		
		
	}

}
