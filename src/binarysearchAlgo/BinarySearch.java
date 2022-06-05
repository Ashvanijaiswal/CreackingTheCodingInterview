package binarysearchAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=firtOccurance(new int [] {5,10,10,10,10,10,15,20,21,21},21);
		System.out.println(index);
		int recIndex=recFirstOccurance(new int [] {5,10,10,15,15,15,20,21,21},0,9,10);
		System.out.println(recIndex);

	}

	private static int recFirstOccurance(int[] arr, int low, int high, int search) {
		// TODO Auto-generated method stub
		if(low>high)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]<search)
		{
			return recFirstOccurance(arr, mid+1, high, search);
		}
		else if(arr[mid]>search)
		{
			return recFirstOccurance(arr, low, mid-1, search);
		}
		else
		{
			if(mid-1>0 && arr[mid-1]==search)
			{
				return recFirstOccurance(arr, low, mid, search);
			}
			else
			{
				return mid;
			}
		}
		
	}

	private static int firtOccurance(int[] arr, int search) {
		// TODO Auto-generated method stub
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==search)
			{
				if(mid+1<arr.length && arr[mid+1]==search)
				{
					low=mid+1;
					continue;
				}
				else
				{
					return mid;
				}
			}
			else if(arr[mid]<search)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

}
