package binarysearchAlgo;

public class FindInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {100,200,300,20,30,40};
		int search=50;
		int index=findInRotatedArray(arr,search);
		System.out.println(index);

	}

	private static int findInRotatedArray(int[] arr, int search) {
		// TODO Auto-generated method stub
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
//			100,200,300,20,30,40}
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[low]<=arr[mid])
			{
				if(search<arr[mid] && search>arr[low])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else
			{
				if(arr[mid]<search && arr[high]>search)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			
			
		}
		return -1;
	}

}
