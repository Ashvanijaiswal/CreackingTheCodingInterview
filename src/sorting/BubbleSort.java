package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,7,6,5};
		bubbleSortAlgo(arr);
		System.out.println(Arrays.toString(arr));
		

	}

	private static void bubbleSortAlgo(int[] arr) {
		// TODO Auto-generated method stub
		for(int pass=0;pass<arr.length-1;pass++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length-1-pass;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
			{
				break;
			}
		}
		
	}

}
