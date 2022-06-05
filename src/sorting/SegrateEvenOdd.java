package sorting;

import java.util.Arrays;

public class SegrateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,14,13,12,17,20};
		segarteOddEven(arr);

	}

	private static void segarteOddEven(int[] arr) {
		// TODO Auto-generated method stub
		int k=-1;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]&1)==0)
			{
				k++;
				int temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.print(Arrays.toString(arr));
		
	}

}
