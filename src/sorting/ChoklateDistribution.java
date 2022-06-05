package sorting;

import java.util.Arrays;

public class ChoklateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,1,9,56,7,9,12};
		int m=5;
		int res=minDiffrence(arr,m);
		System.out.println(res);
	}

	private static int minDiffrence(int[] arr, int m) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int min=arr[arr.length-1];
		for(int i=m-1;i<arr.length;i++)
		{
			min=Math.min(min, arr[i]-arr[i-(m-1)]);
		}
		return min;
	}

}
