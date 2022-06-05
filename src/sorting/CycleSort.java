package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,1};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void cycleSort(int[] arr) {
		// TODO Auto-generated method stub
		int numOfswap=0;
		for(int cs=0;cs<arr.length-1;cs++)
		{
			int item=arr[cs];
			int pos=cs;
			for(int i=cs+1;i<arr.length;i++)
			{
				if(arr[i]<item)
				{
					pos++;
				}
			}
			if(item!=arr[pos]) {
			int temp=arr[pos];
			arr[pos]=item;
			item=temp;
			numOfswap++;}
			
			while(cs!=pos)
			{
				pos=cs;
				for(int i=cs+1;i<arr.length;i++)
				{
					if(arr[i]<item)
					pos++;
				}
				if(item!=arr[pos])
				{
				int temp=arr[pos];
				arr[pos]=item;
				item=temp;
				numOfswap++;}
				
			}
		}
	 
	}

}
