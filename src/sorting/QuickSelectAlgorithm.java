package sorting;

import java.util.Arrays;

public class QuickSelectAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem - Find kth smallest or largest element in an array
//		We can use lamuto partition technique to solve
		int arr[]= {8,10,11,5,20,25,7,9};
		int k=3;
		int res=quickSelect(arr,k);
		System.out.println(res);

	}

	private static int quickSelect(int[] arr, int k) {
		// TODO Auto-generated method stub
		int l=0,h=arr.length-1;
		while(l<=h)
		{
			int p=partition(arr,l,h);
			if(p==k-1)
			{
				return arr[p];
			}
			else if(p>k-1)
			{
				h=p-1;
			}
			else
			{
				l=p+1;
			}
		}
		return -1;
		
	}

	private static int partition(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int i=l-1;
		for(int k=l;k<h;k++)
		{
			if(arr[k]<arr[h])
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		System.out.println(Arrays.toString(arr));
		return i+1;
	}

}
