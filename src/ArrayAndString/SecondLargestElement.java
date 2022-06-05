package ArrayAndString;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generted method stub
		int arr[]= {10,7,12,12,11};
//		String[] months = {"January","February","March","April","May","June","July","August","September","October","December"};
//		Arrays.sort(months,(String a, String b) -> a.length() - b.length());
//		Arrays.sort(months, (a, b) -> a.length() - b.length());
		int res=findSecondLargest(arr);
		System.out.println(res);

	}

	private static int findSecondLargest(int[] arr) {
		// TODO Auto-generated method stub
		int max=0;
		int secondMax=-1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				secondMax=max;
				max=i;
			}
			else if( arr[max]!=arr[i])
			{
				if(secondMax==-1 || arr[secondMax]<arr[i])
				{
					secondMax=i;
				}
			}
		}
		return secondMax;
		
	}

}
