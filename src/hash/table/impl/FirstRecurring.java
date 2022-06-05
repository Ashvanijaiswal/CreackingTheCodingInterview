package hash.table.impl;

import java.util.HashSet;

public class FirstRecurring {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		int[]input=new int[]{2,5,1,2,3,5,1,2,4};
		for(int j =0; j < input.length; j++){
			 
			  if(hs.contains(input[j])){
			   System.out.println(input[j]);
			   break;
			  }else{
			    hs.add(input[j]);
			  }
			}
		firstRecuringNum(input);
	}
	
	public static void  firstRecuringNum(int arr[])
	{
		int i,j;
		int d=Integer.MAX_VALUE,l=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && d>j-i)
				{
					l=arr[i];
					d=j-i;
				}
				
			}
			if(d==1)
			{
				
				break;
			}
		}
		System.out.println(l);
	}
}
